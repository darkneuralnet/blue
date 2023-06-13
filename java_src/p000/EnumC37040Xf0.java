package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: Xf0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC37040Xf0 {
    AMERICAN_EXPRESS("amex", Pattern.compile("^3[47][0-9]{0,13}$")),
    ARGENCARD("argencard", Pattern.compile("^(50)(1)\\d*$")),
    BCMC("bcmc", Pattern.compile("^((6703)[0-9]{0,15}|(479658|606005)[0-9]{0,13})$")),
    BIJENKORF_CARD("bijcard", Pattern.compile("^(5100081)[0-9]{0,9}$")),
    CABAL("cabal", Pattern.compile("^(58|6[03])([03469])\\d*$")),
    CARTEBANCAIRE("cartebancaire", Pattern.compile("^[4-6][0-9]{0,15}$")),
    CODENSA("codensa", Pattern.compile("^(590712)[0-9]{0,10}$")),
    CUP("cup", Pattern.compile("^(62|81)[0-9]{0,17}$")),
    DANKORT("dankort", Pattern.compile("^(5019)[0-9]{0,12}$")),
    DINERS("diners", Pattern.compile("^(36)[0-9]{0,12}$")),
    DISCOVER("discover", Pattern.compile("^(6011[0-9]{0,12}|(644|645|646|647|648|649)[0-9]{0,13}|65[0-9]{0,14})$")),
    ELO("elo", Pattern.compile("^((((506699)|(506770)|(506771)|(506772)|(506773)|(506774)|(506775)|(506776)|(506777)|(506778)|(401178)|(438935)|(451416)|(457631)|(457632)|(504175)|(627780)|(636368)|(636297))[0-9]{0,10})|((50676)|(50675)|(50674)|(50673)|(50672)|(50671)|(50670))[0-9]{0,11})$")),
    FORBRUGSFORENINGEN("forbrugsforeningen", Pattern.compile("^(60)(0)\\d*$")),
    VISAALPHABANKBONUS("visaalphabankbonus", Pattern.compile("^(450903)[0-9]{0,10}$")),
    MCALPHABANKBONUS("mcalphabankbonus", Pattern.compile("^(510099)[0-9]{0,10}$")),
    HIPER("hiper", Pattern.compile("^(637095|637599|637609|637612)[0-9]{0,10}$")),
    HIPERCARD("hipercard", Pattern.compile("^(606282)[0-9]{0,10}$")),
    JCB("jcb", Pattern.compile("^(352[8,9]{1}[0-9]{0,15}|35[4-8]{1}[0-9]{0,16})$")),
    OASIS("oasis", Pattern.compile("^(982616)[0-9]{0,10}$")),
    KARENMILLER("karenmillen", Pattern.compile("^(98261465)[0-9]{0,8}$")),
    WAREHOUSE("warehouse", Pattern.compile("^(982633)[0-9]{0,10}$")),
    LASER("laser", Pattern.compile("^(6304|6706|6709|6771)[0-9]{0,15}$")),
    MAESTRO("maestro", Pattern.compile("^(5[0|6-8][0-9]{0,17}|6[0-9]{0,18})$")),
    MAESTRO_UK("maestrouk", Pattern.compile("^(6759)[0-9]{0,15}$")),
    MASTERCARD("mc", Pattern.compile("^(5[1-5][0-9]{0,14}|2[2-7][0-9]{0,14})$")),
    MIR("mir", Pattern.compile("^(220)[0-9]{0,16}$")),
    NARANJA("naranja", Pattern.compile("^(37|40|5[28])([279])\\d*$")),
    SHOPPING("shopping", Pattern.compile("^(27|58|60)([39])\\d*$")),
    SOLO("solo", Pattern.compile("^(6767)[0-9]{0,15}$")),
    TROY("troy", Pattern.compile("^(97)(9)\\d*$")),
    UATP("uatp", Pattern.compile("^1[0-9]{0,14}$")),
    VISA("visa", Pattern.compile("^4[0-9]{0,18}$")),
    VISADANKORT("visadankort", Pattern.compile("^(4571)[0-9]{0,12}$")),
    UNKNOWN("", Pattern.compile("([1-9])+"));
    

    /* renamed from: P */
    public static final Map<String, EnumC37040Xf0> f43514P;

    /* renamed from: b */
    public String f43539b;

    /* renamed from: c */
    public final Pattern f43540c;

    static {
        EnumC37040Xf0[] values;
        HashMap hashMap = new HashMap();
        for (EnumC37040Xf0 enumC37040Xf0 : values()) {
            hashMap.put(enumC37040Xf0.f43539b, enumC37040Xf0);
        }
        f43514P = Collections.unmodifiableMap(hashMap);
    }

    EnumC37040Xf0(String str, Pattern pattern) {
        this.f43539b = str;
        this.f43540c = pattern;
    }

    /* renamed from: a */
    public static List<EnumC37040Xf0> m76731a(String str) {
        EnumC37040Xf0[] values;
        ArrayList arrayList = new ArrayList();
        for (EnumC37040Xf0 enumC37040Xf0 : values()) {
            if (enumC37040Xf0.m76728d(str)) {
                arrayList.add(enumC37040Xf0);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static EnumC37040Xf0 m76730b(String str) {
        return f43514P.get(str);
    }

    /* renamed from: c */
    public String m76729c() {
        return this.f43539b;
    }

    /* renamed from: d */
    public boolean m76728d(String str) {
        Matcher matcher = this.f43540c.matcher(str.replaceAll("\\s", ""));
        if (!matcher.matches() && !matcher.hitEnd()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public void m76727e(String str) {
        this.f43539b = str;
    }
}
