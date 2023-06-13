package p000;

import com.amazonaws.services.p026s3.model.InstructionFileId;
import java.text.DecimalFormat;
/* renamed from: sW0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C48685sW0 extends AbstractC33806Jj6 {

    /* renamed from: a */
    public DecimalFormat f108893a;

    /* renamed from: b */
    public int f108894b;

    public C48685sW0(int i) {
        this.f108894b = i;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(InstructionFileId.DOT);
            }
            stringBuffer.append("0");
        }
        this.f108893a = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }

    @Override // p000.AbstractC33806Jj6
    /* renamed from: f */
    public String mo14123f(float f) {
        return this.f108893a.format(f);
    }

    /* renamed from: j */
    public int m14122j() {
        return this.f108894b;
    }
}
