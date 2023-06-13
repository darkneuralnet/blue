package p000;

import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import java.util.ArrayList;
import java.util.List;
/* renamed from: I81 */
/* loaded from: classes6.dex */
public final class I81 {

    /* renamed from: a */
    public final List<int[]> f14566a = new ArrayList();

    /* renamed from: b */
    public final List<String> f14567b = new ArrayList();

    /* renamed from: a */
    public final void m102918a(int[] iArr, String str) {
        this.f14566a.add(iArr);
        this.f14567b.add(str);
    }

    /* renamed from: b */
    public final synchronized void m102917b() {
        if (!this.f14566a.isEmpty()) {
            return;
        }
        m102918a(new int[]{0, 19}, "US/CA");
        m102918a(new int[]{30, 39}, "US");
        m102918a(new int[]{60, 139}, "US/CA");
        m102918a(new int[]{300, 379}, "FR");
        m102918a(new int[]{380}, "BG");
        m102918a(new int[]{383}, "SI");
        m102918a(new int[]{385}, "HR");
        m102918a(new int[]{387}, "BA");
        m102918a(new int[]{400, 440}, "DE");
        m102918a(new int[]{450, 459}, "JP");
        m102918a(new int[]{460, 469}, "RU");
        m102918a(new int[]{471}, "TW");
        m102918a(new int[]{474}, "EE");
        m102918a(new int[]{475}, "LV");
        m102918a(new int[]{476}, "AZ");
        m102918a(new int[]{477}, "LT");
        m102918a(new int[]{478}, "UZ");
        m102918a(new int[]{479}, "LK");
        m102918a(new int[]{480}, "PH");
        m102918a(new int[]{481}, "BY");
        m102918a(new int[]{482}, "UA");
        m102918a(new int[]{484}, "MD");
        m102918a(new int[]{485}, "AM");
        m102918a(new int[]{486}, "GE");
        m102918a(new int[]{487}, "KZ");
        m102918a(new int[]{489}, "HK");
        m102918a(new int[]{490, 499}, "JP");
        m102918a(new int[]{500, 509}, "GB");
        m102918a(new int[]{520}, "GR");
        m102918a(new int[]{528}, "LB");
        m102918a(new int[]{529}, "CY");
        m102918a(new int[]{531}, "MK");
        m102918a(new int[]{535}, "MT");
        m102918a(new int[]{539}, "IE");
        m102918a(new int[]{540, 549}, "BE/LU");
        m102918a(new int[]{560}, "PT");
        m102918a(new int[]{569}, "IS");
        m102918a(new int[]{570, 579}, "DK");
        m102918a(new int[]{590}, "PL");
        m102918a(new int[]{594}, "RO");
        m102918a(new int[]{599}, "HU");
        m102918a(new int[]{600, 601}, "ZA");
        m102918a(new int[]{603}, "GH");
        m102918a(new int[]{608}, "BH");
        m102918a(new int[]{609}, "MU");
        m102918a(new int[]{611}, "MA");
        m102918a(new int[]{613}, "DZ");
        m102918a(new int[]{616}, "KE");
        m102918a(new int[]{618}, "CI");
        m102918a(new int[]{619}, "TN");
        m102918a(new int[]{621}, "SY");
        m102918a(new int[]{622}, "EG");
        m102918a(new int[]{624}, "LY");
        m102918a(new int[]{625}, "JO");
        m102918a(new int[]{626}, "IR");
        m102918a(new int[]{627}, "KW");
        m102918a(new int[]{628}, "SA");
        m102918a(new int[]{629}, "AE");
        m102918a(new int[]{640, 649}, "FI");
        m102918a(new int[]{690, 695}, "CN");
        m102918a(new int[]{700, 709}, "NO");
        m102918a(new int[]{729}, "IL");
        m102918a(new int[]{730, 739}, "SE");
        m102918a(new int[]{740}, "GT");
        m102918a(new int[]{741}, "SV");
        m102918a(new int[]{742}, "HN");
        m102918a(new int[]{743}, "NI");
        m102918a(new int[]{744}, "CR");
        m102918a(new int[]{745}, "PA");
        m102918a(new int[]{746}, "DO");
        m102918a(new int[]{750}, "MX");
        m102918a(new int[]{754, 755}, "CA");
        m102918a(new int[]{759}, "VE");
        m102918a(new int[]{760, 769}, "CH");
        m102918a(new int[]{770}, "CO");
        m102918a(new int[]{773}, "UY");
        m102918a(new int[]{775}, "PE");
        m102918a(new int[]{777}, "BO");
        m102918a(new int[]{779}, "AR");
        m102918a(new int[]{780}, "CL");
        m102918a(new int[]{784}, "PY");
        m102918a(new int[]{785}, "PE");
        m102918a(new int[]{786}, "EC");
        m102918a(new int[]{789, 790}, "BR");
        m102918a(new int[]{800, 839}, "IT");
        m102918a(new int[]{840, 849}, "ES");
        m102918a(new int[]{850}, "CU");
        m102918a(new int[]{858}, "SK");
        m102918a(new int[]{859}, "CZ");
        m102918a(new int[]{860}, "YU");
        m102918a(new int[]{865}, "MN");
        m102918a(new int[]{867}, "KP");
        m102918a(new int[]{868, 869}, "TR");
        m102918a(new int[]{870, 879}, "NL");
        m102918a(new int[]{880}, "KR");
        m102918a(new int[]{885}, "TH");
        m102918a(new int[]{888}, "SG");
        m102918a(new int[]{890}, "IN");
        m102918a(new int[]{893}, "VN");
        m102918a(new int[]{896}, "PK");
        m102918a(new int[]{899}, "ID");
        m102918a(new int[]{STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS, 919}, "AT");
        m102918a(new int[]{930, 939}, "AU");
        m102918a(new int[]{940, 949}, "AZ");
        m102918a(new int[]{955}, "MY");
        m102918a(new int[]{958}, "MO");
    }

    /* renamed from: c */
    public String m102916c(String str) {
        int[] iArr;
        int i;
        m102917b();
        int parseInt = Integer.parseInt(str.substring(0, 3));
        int size = this.f14566a.size();
        for (int i2 = 0; i2 < size && parseInt >= (i = (iArr = this.f14566a.get(i2))[0]); i2++) {
            if (iArr.length != 1) {
                i = iArr[1];
            }
            if (parseInt <= i) {
                return this.f14567b.get(i2);
            }
        }
        return null;
    }
}
