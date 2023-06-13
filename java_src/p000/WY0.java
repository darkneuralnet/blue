package p000;

import com.amazonaws.services.p026s3.model.InstructionFileId;
import java.text.DecimalFormat;
/* renamed from: WY0 */
/* loaded from: classes5.dex */
public class WY0 extends AbstractC33806Jj6 {

    /* renamed from: a */
    public DecimalFormat f41262a;

    /* renamed from: b */
    public int f41263b;

    public WY0(int i) {
        m78241j(i);
    }

    @Override // p000.AbstractC33806Jj6
    /* renamed from: f */
    public String mo14123f(float f) {
        return this.f41262a.format(f);
    }

    /* renamed from: j */
    public void m78241j(int i) {
        this.f41263b = i;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(InstructionFileId.DOT);
            }
            stringBuffer.append("0");
        }
        this.f41262a = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }
}
