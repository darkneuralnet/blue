package ch.qos.logback.core.status;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public abstract class StatusBase implements Status {
    private static final List<Status> EMPTY_LIST = new ArrayList(0);
    List<Status> childrenList;
    long date;
    int level;
    final String message;
    final Object origin;
    Throwable throwable;

    public StatusBase(int i, String str, Object obj) {
        this(i, str, obj, null);
    }

    @Override // ch.qos.logback.core.status.Status
    public synchronized void add(Status status) {
        if (status == null) {
            throw new NullPointerException("Null values are not valid Status.");
        }
        if (this.childrenList == null) {
            this.childrenList = new ArrayList();
        }
        this.childrenList.add(status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            StatusBase statusBase = (StatusBase) obj;
            if (this.level != statusBase.level) {
                return false;
            }
            String str = this.message;
            String str2 = statusBase.message;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // ch.qos.logback.core.status.Status
    public Long getDate() {
        return Long.valueOf(this.date);
    }

    @Override // ch.qos.logback.core.status.Status
    public synchronized int getEffectiveLevel() {
        int i;
        i = this.level;
        Iterator<Status> it = iterator();
        while (it.hasNext()) {
            int effectiveLevel = it.next().getEffectiveLevel();
            if (effectiveLevel > i) {
                i = effectiveLevel;
            }
        }
        return i;
    }

    @Override // ch.qos.logback.core.status.Status
    public int getLevel() {
        return this.level;
    }

    @Override // ch.qos.logback.core.status.Status
    public String getMessage() {
        return this.message;
    }

    @Override // ch.qos.logback.core.status.Status
    public Object getOrigin() {
        return this.origin;
    }

    @Override // ch.qos.logback.core.status.Status
    public Throwable getThrowable() {
        return this.throwable;
    }

    @Override // ch.qos.logback.core.status.Status
    public synchronized boolean hasChildren() {
        boolean z;
        List<Status> list = this.childrenList;
        if (list != null) {
            z = list.size() > 0;
        }
        return z;
    }

    public int hashCode() {
        int i = (this.level + 31) * 31;
        String str = this.message;
        return i + (str == null ? 0 : str.hashCode());
    }

    @Override // ch.qos.logback.core.status.Status
    public synchronized Iterator<Status> iterator() {
        List<Status> list = this.childrenList;
        if (list != null) {
            return list.iterator();
        }
        return EMPTY_LIST.iterator();
    }

    @Override // ch.qos.logback.core.status.Status
    public synchronized boolean remove(Status status) {
        List<Status> list = this.childrenList;
        if (list == null) {
            return false;
        }
        return list.remove(status);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int effectiveLevel = getEffectiveLevel();
        if (effectiveLevel == 0) {
            str = "INFO";
        } else if (effectiveLevel != 1) {
            if (effectiveLevel == 2) {
                str = "ERROR";
            }
            if (this.origin != null) {
                sb.append(" in ");
                sb.append(this.origin);
                sb.append(" -");
            }
            sb.append(" ");
            sb.append(this.message);
            if (this.throwable != null) {
                sb.append(" ");
                sb.append(this.throwable);
            }
            return sb.toString();
        } else {
            str = "WARN";
        }
        sb.append(str);
        if (this.origin != null) {
        }
        sb.append(" ");
        sb.append(this.message);
        if (this.throwable != null) {
        }
        return sb.toString();
    }

    public StatusBase(int i, String str, Object obj, Throwable th) {
        this.level = i;
        this.message = str;
        this.origin = obj;
        this.throwable = th;
        this.date = System.currentTimeMillis();
    }
}
