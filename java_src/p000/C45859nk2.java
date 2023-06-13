package p000;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.C11512a;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: nk2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C45859nk2 {

    /* renamed from: b */
    public static HashMap<String, Constructor<? extends AbstractC37078Xj2>> f100440b;

    /* renamed from: a */
    public HashMap<Integer, ArrayList<AbstractC37078Xj2>> f100441a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends AbstractC37078Xj2>> hashMap = new HashMap<>();
        f100440b = hashMap;
        try {
            hashMap.put("KeyAttribute", C39319ck2.class.getConstructor(new Class[0]));
            f100440b.put("KeyPosition", C32641Ek2.class.getConstructor(new Class[0]));
            f100440b.put("KeyCycle", C41115fk2.class.getConstructor(new Class[0]));
            f100440b.put("KeyTimeCycle", C34513Mk2.class.getConstructor(new Class[0]));
            f100440b.put("KeyTrigger", C34747Nk2.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e) {
            Log.e("KeyFrames", "unable to load", e);
        }
    }

    public C45859nk2() {
    }

    /* renamed from: a */
    public void m23244a(OV2 ov2) {
        ArrayList<AbstractC37078Xj2> arrayList = this.f100441a.get(-1);
        if (arrayList != null) {
            ov2.m92155b(arrayList);
        }
    }

    /* renamed from: b */
    public void m23243b(OV2 ov2) {
        ArrayList<AbstractC37078Xj2> arrayList = this.f100441a.get(Integer.valueOf(ov2.f26684c));
        if (arrayList != null) {
            ov2.m92155b(arrayList);
        }
        ArrayList<AbstractC37078Xj2> arrayList2 = this.f100441a.get(-1);
        if (arrayList2 != null) {
            Iterator<AbstractC37078Xj2> it = arrayList2.iterator();
            while (it.hasNext()) {
                AbstractC37078Xj2 next = it.next();
                if (next.m76531f(((ConstraintLayout.LayoutParams) ov2.f26683b.getLayoutParams()).f53976c0)) {
                    ov2.m92156a(next);
                }
            }
        }
    }

    /* renamed from: c */
    public void m23242c(AbstractC37078Xj2 abstractC37078Xj2) {
        if (!this.f100441a.containsKey(Integer.valueOf(abstractC37078Xj2.f43731b))) {
            this.f100441a.put(Integer.valueOf(abstractC37078Xj2.f43731b), new ArrayList<>());
        }
        ArrayList<AbstractC37078Xj2> arrayList = this.f100441a.get(Integer.valueOf(abstractC37078Xj2.f43731b));
        if (arrayList != null) {
            arrayList.add(abstractC37078Xj2);
        }
    }

    /* renamed from: d */
    public ArrayList<AbstractC37078Xj2> m23241d(int i) {
        return this.f100441a.get(Integer.valueOf(i));
    }

    public C45859nk2(Context context, XmlPullParser xmlPullParser) {
        Exception e;
        AbstractC37078Xj2 abstractC37078Xj2;
        Constructor<? extends AbstractC37078Xj2> constructor;
        HashMap<String, C11512a> hashMap;
        HashMap<String, C11512a> hashMap2;
        try {
            int eventType = xmlPullParser.getEventType();
            AbstractC37078Xj2 abstractC37078Xj22 = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && "KeyFrameSet".equals(xmlPullParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlPullParser.getName();
                    if (f100440b.containsKey(name)) {
                        try {
                            constructor = f100440b.get(name);
                        } catch (Exception e2) {
                            AbstractC37078Xj2 abstractC37078Xj23 = abstractC37078Xj22;
                            e = e2;
                            abstractC37078Xj2 = abstractC37078Xj23;
                        }
                        if (constructor != null) {
                            abstractC37078Xj2 = constructor.newInstance(new Object[0]);
                            try {
                                abstractC37078Xj2.mo40947e(context, Xml.asAttributeSet(xmlPullParser));
                                m23242c(abstractC37078Xj2);
                            } catch (Exception e3) {
                                e = e3;
                                Log.e("KeyFrames", "unable to create ", e);
                                abstractC37078Xj22 = abstractC37078Xj2;
                                continue;
                                eventType = xmlPullParser.next();
                            }
                            abstractC37078Xj22 = abstractC37078Xj2;
                            continue;
                        } else {
                            throw new NullPointerException("Keymaker for " + name + " not found");
                            break;
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (abstractC37078Xj22 != null && (hashMap2 = abstractC37078Xj22.f43734e) != null) {
                            C11512a.m67853i(context, xmlPullParser, hashMap2);
                            continue;
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && abstractC37078Xj22 != null && (hashMap = abstractC37078Xj22.f43734e) != null) {
                        C11512a.m67853i(context, xmlPullParser, hashMap);
                        continue;
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        } catch (XmlPullParserException e5) {
            e5.printStackTrace();
        }
    }
}
