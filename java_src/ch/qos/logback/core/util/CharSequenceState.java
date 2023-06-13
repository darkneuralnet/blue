package ch.qos.logback.core.util;
/* loaded from: classes.dex */
class CharSequenceState {

    /* renamed from: c */
    final char f61071c;
    int occurrences = 1;

    public CharSequenceState(char c) {
        this.f61071c = c;
    }

    public void incrementOccurrences() {
        this.occurrences++;
    }
}
