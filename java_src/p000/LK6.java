package p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
/* renamed from: LK6 */
/* loaded from: classes6.dex */
public final class LK6 extends BL6 {

    /* renamed from: b */
    public final File f21291b;

    /* renamed from: c */
    public final File f21292c;

    /* renamed from: d */
    public final NavigableMap<Long, File> f21293d = new TreeMap();

    public LK6(File file, File file2) throws IOException {
        this.f21291b = file;
        this.f21292c = file2;
        List<File> m64614a = C38513bN6.m64614a(file, file2);
        if (m64614a.isEmpty()) {
            throw new C49185tL6(String.format("Virtualized slice archive empty for %s, %s", file, file2));
        }
        long j = 0;
        for (File file3 : m64614a) {
            this.f21293d.put(Long.valueOf(j), file3);
            j += file3.length();
        }
    }

    @Override // p000.BL6
    /* renamed from: a */
    public final long mo97073a() {
        Map.Entry<Long, File> lastEntry = this.f21293d.lastEntry();
        return lastEntry.getKey().longValue() + lastEntry.getValue().length();
    }

    @Override // p000.BL6
    /* renamed from: b */
    public final InputStream mo97072b(long j, long j2) throws IOException {
        if (j < 0 || j2 < 0) {
            throw new C49185tL6(String.format("Invalid input parameters %s, %s", Long.valueOf(j), Long.valueOf(j2)));
        }
        long j3 = j + j2;
        if (j3 <= mo97073a()) {
            Long floorKey = this.f21293d.floorKey(Long.valueOf(j));
            Long floorKey2 = this.f21293d.floorKey(Long.valueOf(j3));
            if (floorKey.equals(floorKey2)) {
                return new JK6(m97071d(j, floorKey), j2);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(m97071d(j, floorKey));
            Collection<File> values = this.f21293d.subMap(floorKey, false, floorKey2, false).values();
            if (!values.isEmpty()) {
                arrayList.add(new CM6(Collections.enumeration(values)));
            }
            arrayList.add(new JK6(new FileInputStream(this.f21293d.get(floorKey2)), j2 - (floorKey2.longValue() - j)));
            return new SequenceInputStream(Collections.enumeration(arrayList));
        }
        throw new C49185tL6(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", Long.valueOf(mo97073a()), Long.valueOf(j3)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    /* renamed from: d */
    public final InputStream m97071d(long j, Long l) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(this.f21293d.get(l));
        if (fileInputStream.skip(j - l.longValue()) == j - l.longValue()) {
            return fileInputStream;
        }
        throw new C49185tL6(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", l));
    }
}
