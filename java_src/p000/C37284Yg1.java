package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* renamed from: Yg1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C37284Yg1 implements Serializable {
    private static final long serialVersionUID = -6024911025449780478L;

    /* renamed from: b */
    public Throwable f46273b;

    /* renamed from: c */
    public List<InterfaceC33442Hv2> f46274c = new ArrayList();

    /* renamed from: d */
    public List<Object[]> f46275d = new ArrayList();

    /* renamed from: e */
    public Map<String, Object> f46276e = new HashMap();

    public C37284Yg1(Throwable th) {
        this.f46273b = th;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.f46273b = (Throwable) objectInputStream.readObject();
        m74478d(objectInputStream);
        m74479c(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.f46273b);
        m74472j(objectOutputStream);
        m74473i(objectOutputStream);
    }

    /* renamed from: a */
    public void m74481a(InterfaceC33442Hv2 interfaceC33442Hv2, Object... objArr) {
        this.f46274c.add(interfaceC33442Hv2);
        this.f46275d.add(C25025jo.m29902a(objArr));
    }

    /* renamed from: b */
    public final String m74480b(Locale locale, String str) {
        StringBuilder sb = new StringBuilder();
        int size = this.f46274c.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            sb.append(new MessageFormat(this.f46274c.get(i2).mo99563t2(locale), locale).format(this.f46275d.get(i2)));
            i++;
            if (i < size) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    public final void m74479c(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        int readInt = objectInputStream.readInt();
        this.f46276e = new HashMap();
        for (int i = 0; i < readInt; i++) {
            Object readObject = objectInputStream.readObject();
            this.f46276e.put((String) objectInputStream.readObject(), readObject);
        }
    }

    /* renamed from: d */
    public final void m74478d(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        int readInt = objectInputStream.readInt();
        this.f46274c = new ArrayList(readInt);
        this.f46275d = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f46274c.add((InterfaceC33442Hv2) objectInputStream.readObject());
            int readInt2 = objectInputStream.readInt();
            Object[] objArr = new Object[readInt2];
            for (int i2 = 0; i2 < readInt2; i2++) {
                objArr[i2] = objectInputStream.readObject();
            }
            this.f46275d.add(objArr);
        }
    }

    /* renamed from: e */
    public String m74477e() {
        return m74475g(Locale.getDefault());
    }

    /* renamed from: f */
    public String m74476f() {
        return m74475g(Locale.US);
    }

    /* renamed from: g */
    public String m74475g(Locale locale) {
        return m74480b(locale, ": ");
    }

    /* renamed from: h */
    public final String m74474h(Object obj) {
        return "[Object could not be serialized: " + obj.getClass().getName() + "]";
    }

    /* renamed from: i */
    public final void m74473i(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f46276e.size());
        for (Map.Entry<String, Object> entry : this.f46276e.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            Object value = entry.getValue();
            if (value instanceof Serializable) {
                objectOutputStream.writeObject(value);
            } else {
                objectOutputStream.writeObject(m74474h(value));
            }
        }
    }

    /* renamed from: j */
    public final void m74472j(ObjectOutputStream objectOutputStream) throws IOException {
        int size = this.f46274c.size();
        objectOutputStream.writeInt(size);
        for (int i = 0; i < size; i++) {
            objectOutputStream.writeObject(this.f46274c.get(i));
            Object[] objArr = this.f46275d.get(i);
            objectOutputStream.writeInt(objArr.length);
            for (Object obj : objArr) {
                if (obj instanceof Serializable) {
                    objectOutputStream.writeObject(obj);
                } else {
                    objectOutputStream.writeObject(m74474h(obj));
                }
            }
        }
    }
}
