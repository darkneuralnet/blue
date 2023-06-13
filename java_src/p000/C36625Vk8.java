package p000;

import android.content.Context;
import java.io.IOException;
/* renamed from: Vk8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36625Vk8 {
    /* renamed from: a */
    public static C49842uS7 m79471a(Context context, float f, int i) throws IOException {
        C46578ow8 m111226D = C32287Cw8.m111226D();
        m111226D.m20252p(AbstractC44175kt7.m28225F(context.getAssets().open("mlkit_label_default_model/mobile_ica_8bit_with_metadata_tflite")));
        return m79470b(m111226D, f, i, null);
    }

    /* renamed from: b */
    public static C49842uS7 m79470b(C46578ow8 c46578ow8, float f, int i, C46578ow8 c46578ow82) {
        C44390lF8 m80129D = VF8.m80129D();
        m80129D.m27609A(c46578ow8);
        m80129D.m27602t(i);
        if (f >= 0.0f) {
            m80129D.m27607C(f);
        }
        if (c46578ow82 != null) {
            m80129D.m27606D(c46578ow82);
        }
        C40948fS7 m10263E = C49842uS7.m10263E();
        C43089j38 m21843D = C46064o48.m21843D();
        m21843D.m31207p(m80129D);
        m21843D.m31212B(true);
        m10263E.m41306r(m21843D);
        C41091fh8 m11911D = C49392th8.m11911D();
        m11911D.m41016q(2);
        m10263E.m41305t(m11911D);
        C50273vA8 m71702D = C37868aH8.m71702D();
        m71702D.m9056p(2);
        m10263E.m41307q(m71702D);
        return (C49842uS7) m10263E.mo42381i();
    }
}
