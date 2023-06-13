package ch.qos.logback.core.spi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class AbstractComponentTracker<C> implements ComponentTracker<C> {
    private static final boolean ACCESS_ORDERED = true;
    public static final long LINGERING_TIMEOUT = 10000;
    public static final long WAIT_BETWEEN_SUCCESSIVE_REMOVAL_ITERATIONS = 1000;
    protected int maxComponents = Integer.MAX_VALUE;
    protected long timeout = ComponentTracker.DEFAULT_TIMEOUT;
    LinkedHashMap<String, Entry<C>> liveMap = new LinkedHashMap<>(32, 0.75f, true);
    LinkedHashMap<String, Entry<C>> lingerersMap = new LinkedHashMap<>(16, 0.75f, true);
    long lastCheck = 0;
    private RemovalPredicator<C> byExcedent = new RemovalPredicator<C>() { // from class: ch.qos.logback.core.spi.AbstractComponentTracker.1
        @Override // ch.qos.logback.core.spi.AbstractComponentTracker.RemovalPredicator
        public boolean isSlatedForRemoval(Entry<C> entry, long j) {
            return AbstractComponentTracker.this.liveMap.size() > AbstractComponentTracker.this.maxComponents;
        }
    };
    private RemovalPredicator<C> byTimeout = new RemovalPredicator<C>() { // from class: ch.qos.logback.core.spi.AbstractComponentTracker.2
        @Override // ch.qos.logback.core.spi.AbstractComponentTracker.RemovalPredicator
        public boolean isSlatedForRemoval(Entry<C> entry, long j) {
            return AbstractComponentTracker.this.isEntryStale(entry, j);
        }
    };
    private RemovalPredicator<C> byLingering = new RemovalPredicator<C>() { // from class: ch.qos.logback.core.spi.AbstractComponentTracker.3
        @Override // ch.qos.logback.core.spi.AbstractComponentTracker.RemovalPredicator
        public boolean isSlatedForRemoval(Entry<C> entry, long j) {
            return AbstractComponentTracker.this.isEntryDoneLingering(entry, j);
        }
    };

    /* loaded from: classes.dex */
    public static class Entry<C> {
        C component;
        String key;
        long timestamp;

        public Entry(String str, C c, long j) {
            this.key = str;
            this.component = c;
            this.timestamp = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                Entry entry = (Entry) obj;
                String str = this.key;
                if (str == null) {
                    if (entry.key != null) {
                        return false;
                    }
                } else if (!str.equals(entry.key)) {
                    return false;
                }
                C c = this.component;
                C c2 = entry.component;
                if (c == null) {
                    if (c2 != null) {
                        return false;
                    }
                } else if (!c.equals(c2)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.key.hashCode();
        }

        public void setTimestamp(long j) {
            this.timestamp = j;
        }

        public String toString() {
            return "(" + this.key + ", " + this.component + ")";
        }
    }

    /* loaded from: classes.dex */
    public interface RemovalPredicator<C> {
        boolean isSlatedForRemoval(Entry<C> entry, long j);
    }

    private void genericStaleComponentRemover(LinkedHashMap<String, Entry<C>> linkedHashMap, long j, RemovalPredicator<C> removalPredicator) {
        Iterator<Map.Entry<String, Entry<C>>> it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Entry<C> value = it.next().getValue();
            if (!removalPredicator.isSlatedForRemoval(value, j)) {
                return;
            }
            it.remove();
            processPriorToRemoval(value.component);
        }
    }

    private Entry<C> getFromEitherMap(String str) {
        Entry<C> entry = this.liveMap.get(str);
        return entry != null ? entry : this.lingerersMap.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isEntryDoneLingering(Entry<C> entry, long j) {
        return entry.timestamp + LINGERING_TIMEOUT < j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isEntryStale(Entry<C> entry, long j) {
        return isComponentStale(entry.component) || entry.timestamp + this.timeout < j;
    }

    private boolean isTooSoonForRemovalIteration(long j) {
        if (this.lastCheck + 1000 > j) {
            return true;
        }
        this.lastCheck = j;
        return false;
    }

    private void removeExcedentComponents() {
        genericStaleComponentRemover(this.liveMap, 0L, this.byExcedent);
    }

    private void removeStaleComponentsFromLingerersMap(long j) {
        genericStaleComponentRemover(this.lingerersMap, j, this.byLingering);
    }

    private void removeStaleComponentsFromMainMap(long j) {
        genericStaleComponentRemover(this.liveMap, j, this.byTimeout);
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public Collection<C> allComponents() {
        ArrayList arrayList = new ArrayList();
        for (Entry<C> entry : this.liveMap.values()) {
            arrayList.add(entry.component);
        }
        for (Entry<C> entry2 : this.lingerersMap.values()) {
            arrayList.add(entry2.component);
        }
        return arrayList;
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public Set<String> allKeys() {
        HashSet hashSet = new HashSet(this.liveMap.keySet());
        hashSet.addAll(this.lingerersMap.keySet());
        return hashSet;
    }

    public abstract C buildComponent(String str);

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public void endOfLife(String str) {
        Entry<C> remove = this.liveMap.remove(str);
        if (remove == null) {
            return;
        }
        this.lingerersMap.put(str, remove);
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public synchronized C find(String str) {
        Entry<C> fromEitherMap = getFromEitherMap(str);
        if (fromEitherMap == null) {
            return null;
        }
        return fromEitherMap.component;
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public int getComponentCount() {
        return this.liveMap.size() + this.lingerersMap.size();
    }

    public int getMaxComponents() {
        return this.maxComponents;
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public synchronized C getOrCreate(String str, long j) {
        Entry<C> fromEitherMap;
        fromEitherMap = getFromEitherMap(str);
        if (fromEitherMap == null) {
            Entry<C> entry = new Entry<>(str, buildComponent(str), j);
            this.liveMap.put(str, entry);
            fromEitherMap = entry;
        } else {
            fromEitherMap.setTimestamp(j);
        }
        return fromEitherMap.component;
    }

    public long getTimeout() {
        return this.timeout;
    }

    public abstract boolean isComponentStale(C c);

    public abstract void processPriorToRemoval(C c);

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public synchronized void removeStaleComponents(long j) {
        if (isTooSoonForRemovalIteration(j)) {
            return;
        }
        removeExcedentComponents();
        removeStaleComponentsFromMainMap(j);
        removeStaleComponentsFromLingerersMap(j);
    }

    public void setMaxComponents(int i) {
        this.maxComponents = i;
    }

    public void setTimeout(long j) {
        this.timeout = j;
    }
}
