package org.joda.time.p059tz;

import ch.qos.logback.core.spi.ComponentTracker;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.LongCompanionObject;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.chrono.ISOChronology;
/* renamed from: org.joda.time.tz.DateTimeZoneBuilder */
/* loaded from: classes8.dex */
public class DateTimeZoneBuilder {
    private final ArrayList<RuleSet> iRuleSets = new ArrayList<>(10);

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$DSTZone */
    /* loaded from: classes8.dex */
    public static final class DSTZone extends DateTimeZone {
        private static final long serialVersionUID = 6941492635554961361L;
        final Recurrence iEndRecurrence;
        final int iStandardOffset;
        final Recurrence iStartRecurrence;

        public DSTZone(String str, int i, Recurrence recurrence, Recurrence recurrence2) {
            super(str);
            this.iStandardOffset = i;
            this.iStartRecurrence = recurrence;
            this.iEndRecurrence = recurrence2;
        }

        private Recurrence findMatchingRecurrence(long j) {
            long j2;
            int i = this.iStandardOffset;
            Recurrence recurrence = this.iStartRecurrence;
            Recurrence recurrence2 = this.iEndRecurrence;
            try {
                j2 = recurrence.next(j, i, recurrence2.getSaveMillis());
            } catch (ArithmeticException | IllegalArgumentException unused) {
                j2 = j;
            }
            try {
                j = recurrence2.next(j, i, recurrence.getSaveMillis());
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            if (j2 <= j) {
                return recurrence2;
            }
            return recurrence;
        }

        public static DSTZone readFrom(DataInput dataInput, String str) throws IOException {
            return new DSTZone(str, (int) DateTimeZoneBuilder.readMillis(dataInput), Recurrence.readFrom(dataInput), Recurrence.readFrom(dataInput));
        }

        @Override // org.joda.time.DateTimeZone
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DSTZone)) {
                return false;
            }
            DSTZone dSTZone = (DSTZone) obj;
            if (getID().equals(dSTZone.getID()) && this.iStandardOffset == dSTZone.iStandardOffset && this.iStartRecurrence.equals(dSTZone.iStartRecurrence) && this.iEndRecurrence.equals(dSTZone.iEndRecurrence)) {
                return true;
            }
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public String getNameKey(long j) {
            return findMatchingRecurrence(j).getNameKey();
        }

        @Override // org.joda.time.DateTimeZone
        public int getOffset(long j) {
            return this.iStandardOffset + findMatchingRecurrence(j).getSaveMillis();
        }

        @Override // org.joda.time.DateTimeZone
        public int getStandardOffset(long j) {
            return this.iStandardOffset;
        }

        @Override // org.joda.time.DateTimeZone
        public int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.iStandardOffset), this.iStartRecurrence, this.iEndRecurrence});
        }

        @Override // org.joda.time.DateTimeZone
        public boolean isFixed() {
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
            if (r5 < 0) goto L8;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        @Override // org.joda.time.DateTimeZone
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public long nextTransition(long j) {
            long j2;
            long next;
            int i = this.iStandardOffset;
            Recurrence recurrence = this.iStartRecurrence;
            Recurrence recurrence2 = this.iEndRecurrence;
            try {
                j2 = recurrence.next(j, i, recurrence2.getSaveMillis());
                if (j > 0) {
                }
            } catch (ArithmeticException | IllegalArgumentException unused) {
            }
            try {
                next = recurrence2.next(j, i, recurrence.getSaveMillis());
                if (j > 0 || next >= 0) {
                    j = next;
                }
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            if (j2 <= j) {
                return j;
            }
            return j2;
            j2 = j;
            next = recurrence2.next(j, i, recurrence.getSaveMillis());
            if (j > 0) {
            }
            j = next;
            if (j2 <= j) {
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
            if (r7 > 0) goto L8;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
        @Override // org.joda.time.DateTimeZone
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public long previousTransition(long j) {
            long j2;
            long previous;
            long j3 = j + 1;
            int i = this.iStandardOffset;
            Recurrence recurrence = this.iStartRecurrence;
            Recurrence recurrence2 = this.iEndRecurrence;
            try {
                j2 = recurrence.previous(j3, i, recurrence2.getSaveMillis());
                if (j3 < 0) {
                }
            } catch (ArithmeticException | IllegalArgumentException unused) {
            }
            try {
                previous = recurrence2.previous(j3, i, recurrence.getSaveMillis());
                if (j3 < 0 || previous <= 0) {
                    j3 = previous;
                }
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            if (j2 <= j3) {
                j2 = j3;
            }
            return j2 - 1;
            j2 = j3;
            previous = recurrence2.previous(j3, i, recurrence.getSaveMillis());
            if (j3 < 0) {
            }
            j3 = previous;
            if (j2 <= j3) {
            }
            return j2 - 1;
        }

        public void writeTo(DataOutput dataOutput) throws IOException {
            DateTimeZoneBuilder.writeMillis(dataOutput, this.iStandardOffset);
            this.iStartRecurrence.writeTo(dataOutput);
            this.iEndRecurrence.writeTo(dataOutput);
        }
    }

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$OfYear */
    /* loaded from: classes8.dex */
    public static final class OfYear {
        final boolean iAdvance;
        final int iDayOfMonth;
        final int iDayOfWeek;
        final int iMillisOfDay;
        final char iMode;
        final int iMonthOfYear;

        public OfYear(char c, int i, int i2, int i3, boolean z, int i4) {
            if (c != 'u' && c != 'w' && c != 's') {
                throw new IllegalArgumentException("Unknown mode: " + c);
            }
            this.iMode = c;
            this.iMonthOfYear = i;
            this.iDayOfMonth = i2;
            this.iDayOfWeek = i3;
            this.iAdvance = z;
            this.iMillisOfDay = i4;
        }

        public static OfYear readFrom(DataInput dataInput) throws IOException {
            return new OfYear((char) dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) DateTimeZoneBuilder.readMillis(dataInput));
        }

        private long setDayOfMonth(Chronology chronology, long j) {
            if (this.iDayOfMonth >= 0) {
                return chronology.dayOfMonth().set(j, this.iDayOfMonth);
            }
            return chronology.dayOfMonth().add(chronology.monthOfYear().add(chronology.dayOfMonth().set(j, 1), 1), this.iDayOfMonth);
        }

        private long setDayOfMonthNext(Chronology chronology, long j) {
            try {
                return setDayOfMonth(chronology, j);
            } catch (IllegalArgumentException e) {
                if (this.iMonthOfYear == 2 && this.iDayOfMonth == 29) {
                    while (!chronology.year().isLeap(j)) {
                        j = chronology.year().add(j, 1);
                    }
                    return setDayOfMonth(chronology, j);
                }
                throw e;
            }
        }

        private long setDayOfMonthPrevious(Chronology chronology, long j) {
            try {
                return setDayOfMonth(chronology, j);
            } catch (IllegalArgumentException e) {
                if (this.iMonthOfYear == 2 && this.iDayOfMonth == 29) {
                    while (!chronology.year().isLeap(j)) {
                        j = chronology.year().add(j, -1);
                    }
                    return setDayOfMonth(chronology, j);
                }
                throw e;
            }
        }

        private long setDayOfWeek(Chronology chronology, long j) {
            int i = this.iDayOfWeek - chronology.dayOfWeek().get(j);
            if (i != 0) {
                if (this.iAdvance) {
                    if (i < 0) {
                        i += 7;
                    }
                } else if (i > 0) {
                    i -= 7;
                }
                return chronology.dayOfWeek().add(j, i);
            }
            return j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfYear)) {
                return false;
            }
            OfYear ofYear = (OfYear) obj;
            if (this.iMode == ofYear.iMode && this.iMonthOfYear == ofYear.iMonthOfYear && this.iDayOfMonth == ofYear.iDayOfMonth && this.iDayOfWeek == ofYear.iDayOfWeek && this.iAdvance == ofYear.iAdvance && this.iMillisOfDay == ofYear.iMillisOfDay) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Character.valueOf(this.iMode), Integer.valueOf(this.iMonthOfYear), Integer.valueOf(this.iDayOfMonth), Integer.valueOf(this.iDayOfWeek), Boolean.valueOf(this.iAdvance), Integer.valueOf(this.iMillisOfDay)});
        }

        public long next(long j, int i, int i2) {
            char c = this.iMode;
            if (c == 'w') {
                i += i2;
            } else if (c != 's') {
                i = 0;
            }
            long j2 = i;
            long j3 = j + j2;
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            long dayOfMonthNext = setDayOfMonthNext(instanceUTC, instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(instanceUTC.monthOfYear().set(j3, this.iMonthOfYear), 0), Math.min(this.iMillisOfDay, 86399999)));
            if (this.iDayOfWeek == 0) {
                if (dayOfMonthNext <= j3) {
                    dayOfMonthNext = setDayOfMonthNext(instanceUTC, instanceUTC.year().add(dayOfMonthNext, 1));
                }
            } else {
                dayOfMonthNext = setDayOfWeek(instanceUTC, dayOfMonthNext);
                if (dayOfMonthNext <= j3) {
                    dayOfMonthNext = setDayOfWeek(instanceUTC, setDayOfMonthNext(instanceUTC, instanceUTC.monthOfYear().set(instanceUTC.year().add(dayOfMonthNext, 1), this.iMonthOfYear)));
                }
            }
            return instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(dayOfMonthNext, 0), this.iMillisOfDay) - j2;
        }

        public long previous(long j, int i, int i2) {
            char c = this.iMode;
            if (c == 'w') {
                i += i2;
            } else if (c != 's') {
                i = 0;
            }
            long j2 = i;
            long j3 = j + j2;
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            long dayOfMonthPrevious = setDayOfMonthPrevious(instanceUTC, instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(instanceUTC.monthOfYear().set(j3, this.iMonthOfYear), 0), this.iMillisOfDay));
            if (this.iDayOfWeek == 0) {
                if (dayOfMonthPrevious >= j3) {
                    dayOfMonthPrevious = setDayOfMonthPrevious(instanceUTC, instanceUTC.year().add(dayOfMonthPrevious, -1));
                }
            } else {
                dayOfMonthPrevious = setDayOfWeek(instanceUTC, dayOfMonthPrevious);
                if (dayOfMonthPrevious >= j3) {
                    dayOfMonthPrevious = setDayOfWeek(instanceUTC, setDayOfMonthPrevious(instanceUTC, instanceUTC.monthOfYear().set(instanceUTC.year().add(dayOfMonthPrevious, -1), this.iMonthOfYear)));
                }
            }
            return instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(dayOfMonthPrevious, 0), this.iMillisOfDay) - j2;
        }

        public long setInstant(int i, int i2, int i3) {
            char c = this.iMode;
            if (c == 'w') {
                i2 += i3;
            } else if (c != 's') {
                i2 = 0;
            }
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            long dayOfMonth = setDayOfMonth(instanceUTC, instanceUTC.millisOfDay().set(instanceUTC.monthOfYear().set(instanceUTC.year().set(0L, i), this.iMonthOfYear), this.iMillisOfDay));
            if (this.iDayOfWeek != 0) {
                dayOfMonth = setDayOfWeek(instanceUTC, dayOfMonth);
            }
            return dayOfMonth - i2;
        }

        public String toString() {
            return "[OfYear]\nMode: " + this.iMode + "\nMonthOfYear: " + this.iMonthOfYear + "\nDayOfMonth: " + this.iDayOfMonth + "\nDayOfWeek: " + this.iDayOfWeek + "\nAdvanceDayOfWeek: " + this.iAdvance + "\nMillisOfDay: " + this.iMillisOfDay + '\n';
        }

        public void writeTo(DataOutput dataOutput) throws IOException {
            dataOutput.writeByte(this.iMode);
            dataOutput.writeByte(this.iMonthOfYear);
            dataOutput.writeByte(this.iDayOfMonth);
            dataOutput.writeByte(this.iDayOfWeek);
            dataOutput.writeBoolean(this.iAdvance);
            DateTimeZoneBuilder.writeMillis(dataOutput, this.iMillisOfDay);
        }
    }

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone */
    /* loaded from: classes8.dex */
    public static final class PrecalculatedZone extends DateTimeZone {
        private static final long serialVersionUID = 7811976468055766265L;
        private final String[] iNameKeys;
        private final int[] iStandardOffsets;
        private final DSTZone iTailZone;
        private final long[] iTransitions;
        private final int[] iWallOffsets;

        private PrecalculatedZone(String str, long[] jArr, int[] iArr, int[] iArr2, String[] strArr, DSTZone dSTZone) {
            super(str);
            this.iTransitions = jArr;
            this.iWallOffsets = iArr;
            this.iStandardOffsets = iArr2;
            this.iNameKeys = strArr;
            this.iTailZone = dSTZone;
        }

        public static PrecalculatedZone create(String str, boolean z, ArrayList<Transition> arrayList, DSTZone dSTZone) {
            String[][] zoneStrings;
            DSTZone dSTZone2;
            DSTZone dSTZone3;
            DSTZone dSTZone4 = dSTZone;
            int size = arrayList.size();
            if (size != 0) {
                long[] jArr = new long[size];
                int[] iArr = new int[size];
                int[] iArr2 = new int[size];
                String[] strArr = new String[size];
                int i = 0;
                Transition transition = null;
                int i2 = 0;
                while (i2 < size) {
                    Transition transition2 = arrayList.get(i2);
                    if (transition2.isTransitionFrom(transition)) {
                        jArr[i2] = transition2.getMillis();
                        iArr[i2] = transition2.getWallOffset();
                        iArr2[i2] = transition2.getStandardOffset();
                        strArr[i2] = transition2.getNameKey();
                        i2++;
                        transition = transition2;
                    } else {
                        throw new IllegalArgumentException(str);
                    }
                }
                String[] strArr2 = new String[5];
                for (String[] strArr3 : new DateFormatSymbols(Locale.ENGLISH).getZoneStrings()) {
                    if (strArr3 != null && strArr3.length == 5 && str.equals(strArr3[0])) {
                        strArr2 = strArr3;
                    }
                }
                ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
                while (i < size - 1) {
                    String str2 = strArr[i];
                    int i3 = i + 1;
                    String str3 = strArr[i3];
                    long j = iArr[i];
                    long j2 = iArr[i3];
                    String[] strArr4 = strArr;
                    String[] strArr5 = strArr2;
                    long j3 = iArr2[i];
                    int[] iArr3 = iArr;
                    int[] iArr4 = iArr2;
                    long j4 = iArr2[i3];
                    int i4 = size;
                    Period period = new Period(jArr[i], jArr[i3], PeriodType.yearMonthDay(), instanceUTC);
                    int i5 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                    if (i5 != 0 && j3 == j4 && str2.equals(str3) && period.getYears() == 0 && period.getMonths() > 4 && period.getMonths() < 8 && str2.equals(strArr5[2]) && str2.equals(strArr5[4])) {
                        if (ZoneInfoLogger.verbose()) {
                            System.out.println("Fixing duplicate name key - " + str3);
                            System.out.println("     - " + new DateTime(jArr[i], instanceUTC) + " - " + new DateTime(jArr[i3], instanceUTC));
                        }
                        if (i5 > 0) {
                            strArr4[i] = (str2 + "-Summer").intern();
                        } else {
                            strArr4[i3] = (str3 + "-Summer").intern();
                            i = i3;
                        }
                    }
                    i++;
                    strArr2 = strArr5;
                    dSTZone4 = dSTZone;
                    strArr = strArr4;
                    iArr = iArr3;
                    iArr2 = iArr4;
                    size = i4;
                }
                DSTZone dSTZone5 = dSTZone4;
                int[] iArr5 = iArr;
                int[] iArr6 = iArr2;
                String[] strArr6 = strArr;
                if (dSTZone5 == null || !dSTZone5.iStartRecurrence.getNameKey().equals(dSTZone5.iEndRecurrence.getNameKey())) {
                    dSTZone2 = dSTZone5;
                } else {
                    if (ZoneInfoLogger.verbose()) {
                        System.out.println("Fixing duplicate recurrent name key - " + dSTZone5.iStartRecurrence.getNameKey());
                    }
                    if (dSTZone5.iStartRecurrence.getSaveMillis() > 0) {
                        dSTZone3 = new DSTZone(dSTZone.getID(), dSTZone5.iStandardOffset, dSTZone5.iStartRecurrence.renameAppend("-Summer"), dSTZone5.iEndRecurrence);
                    } else {
                        dSTZone3 = new DSTZone(dSTZone.getID(), dSTZone5.iStandardOffset, dSTZone5.iStartRecurrence, dSTZone5.iEndRecurrence.renameAppend("-Summer"));
                    }
                    dSTZone2 = dSTZone3;
                }
                return new PrecalculatedZone(z ? str : "", jArr, iArr5, iArr6, strArr6, dSTZone2);
            }
            throw new IllegalArgumentException();
        }

        public static PrecalculatedZone readFrom(DataInput dataInput, String str) throws IOException {
            DSTZone dSTZone;
            int readUnsignedByte;
            int readUnsignedShort = dataInput.readUnsignedShort();
            String[] strArr = new String[readUnsignedShort];
            for (int i = 0; i < readUnsignedShort; i++) {
                strArr[i] = dataInput.readUTF();
            }
            int readInt = dataInput.readInt();
            long[] jArr = new long[readInt];
            int[] iArr = new int[readInt];
            int[] iArr2 = new int[readInt];
            String[] strArr2 = new String[readInt];
            for (int i2 = 0; i2 < readInt; i2++) {
                jArr[i2] = DateTimeZoneBuilder.readMillis(dataInput);
                iArr[i2] = (int) DateTimeZoneBuilder.readMillis(dataInput);
                iArr2[i2] = (int) DateTimeZoneBuilder.readMillis(dataInput);
                if (readUnsignedShort < 256) {
                    try {
                        readUnsignedByte = dataInput.readUnsignedByte();
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw new IOException("Invalid encoding");
                    }
                } else {
                    readUnsignedByte = dataInput.readUnsignedShort();
                }
                strArr2[i2] = strArr[readUnsignedByte];
            }
            if (dataInput.readBoolean()) {
                dSTZone = DSTZone.readFrom(dataInput, str);
            } else {
                dSTZone = null;
            }
            return new PrecalculatedZone(str, jArr, iArr, iArr2, strArr2, dSTZone);
        }

        @Override // org.joda.time.DateTimeZone
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrecalculatedZone)) {
                return false;
            }
            PrecalculatedZone precalculatedZone = (PrecalculatedZone) obj;
            if (getID().equals(precalculatedZone.getID()) && Arrays.equals(this.iTransitions, precalculatedZone.iTransitions) && Arrays.equals(this.iNameKeys, precalculatedZone.iNameKeys) && Arrays.equals(this.iWallOffsets, precalculatedZone.iWallOffsets) && Arrays.equals(this.iStandardOffsets, precalculatedZone.iStandardOffsets)) {
                DSTZone dSTZone = this.iTailZone;
                DSTZone dSTZone2 = precalculatedZone.iTailZone;
                if (dSTZone == null) {
                    if (dSTZone2 == null) {
                        return true;
                    }
                } else if (dSTZone.equals(dSTZone2)) {
                    return true;
                }
            }
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public String getNameKey(long j) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                return this.iNameKeys[binarySearch];
            }
            int i = ~binarySearch;
            if (i < jArr.length) {
                if (i > 0) {
                    return this.iNameKeys[i - 1];
                }
                return "UTC";
            }
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone == null) {
                return this.iNameKeys[i - 1];
            }
            return dSTZone.getNameKey(j);
        }

        @Override // org.joda.time.DateTimeZone
        public int getOffset(long j) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                return this.iWallOffsets[binarySearch];
            }
            int i = ~binarySearch;
            if (i < jArr.length) {
                if (i > 0) {
                    return this.iWallOffsets[i - 1];
                }
                return 0;
            }
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone == null) {
                return this.iWallOffsets[i - 1];
            }
            return dSTZone.getOffset(j);
        }

        @Override // org.joda.time.DateTimeZone
        public int getStandardOffset(long j) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                return this.iStandardOffsets[binarySearch];
            }
            int i = ~binarySearch;
            if (i < jArr.length) {
                if (i > 0) {
                    return this.iStandardOffsets[i - 1];
                }
                return 0;
            }
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone == null) {
                return this.iStandardOffsets[i - 1];
            }
            return dSTZone.getStandardOffset(j);
        }

        @Override // org.joda.time.DateTimeZone
        public int hashCode() {
            return getID().hashCode();
        }

        public boolean isCachable() {
            if (this.iTailZone != null) {
                return true;
            }
            long[] jArr = this.iTransitions;
            if (jArr.length <= 1) {
                return false;
            }
            double d = 0.0d;
            int i = 0;
            for (int i2 = 1; i2 < jArr.length; i2++) {
                long j = jArr[i2] - jArr[i2 - 1];
                if (j < 63158400000L) {
                    d += j;
                    i++;
                }
            }
            if (i > 0 && (d / i) / 8.64E7d >= 25.0d) {
                return true;
            }
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public boolean isFixed() {
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public long nextTransition(long j) {
            int i;
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                i = binarySearch + 1;
            } else {
                i = ~binarySearch;
            }
            if (i < jArr.length) {
                return jArr[i];
            }
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone == null) {
                return j;
            }
            long j2 = jArr[jArr.length - 1];
            if (j < j2) {
                j = j2;
            }
            return dSTZone.nextTransition(j);
        }

        @Override // org.joda.time.DateTimeZone
        public long previousTransition(long j) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                if (j > Long.MIN_VALUE) {
                    return j - 1;
                }
                return j;
            }
            int i = ~binarySearch;
            if (i < jArr.length) {
                if (i > 0) {
                    long j2 = jArr[i - 1];
                    if (j2 > Long.MIN_VALUE) {
                        return j2 - 1;
                    }
                }
                return j;
            }
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone != null) {
                long previousTransition = dSTZone.previousTransition(j);
                if (previousTransition < j) {
                    return previousTransition;
                }
            }
            long j3 = jArr[i - 1];
            if (j3 > Long.MIN_VALUE) {
                return j3 - 1;
            }
            return j;
        }

        public void writeTo(DataOutput dataOutput) throws IOException {
            int length = this.iTransitions.length;
            HashSet<String> hashSet = new HashSet();
            boolean z = false;
            for (int i = 0; i < length; i++) {
                hashSet.add(this.iNameKeys[i]);
            }
            int size = hashSet.size();
            if (size <= 65535) {
                String[] strArr = new String[size];
                int i2 = 0;
                for (String str : hashSet) {
                    strArr[i2] = str;
                    i2++;
                }
                dataOutput.writeShort(size);
                for (int i3 = 0; i3 < size; i3++) {
                    dataOutput.writeUTF(strArr[i3]);
                }
                dataOutput.writeInt(length);
                for (int i4 = 0; i4 < length; i4++) {
                    DateTimeZoneBuilder.writeMillis(dataOutput, this.iTransitions[i4]);
                    DateTimeZoneBuilder.writeMillis(dataOutput, this.iWallOffsets[i4]);
                    DateTimeZoneBuilder.writeMillis(dataOutput, this.iStandardOffsets[i4]);
                    String str2 = this.iNameKeys[i4];
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            break;
                        } else if (strArr[i5].equals(str2)) {
                            if (size < 256) {
                                dataOutput.writeByte(i5);
                            } else {
                                dataOutput.writeShort(i5);
                            }
                        } else {
                            i5++;
                        }
                    }
                }
                if (this.iTailZone != null) {
                    z = true;
                }
                dataOutput.writeBoolean(z);
                DSTZone dSTZone = this.iTailZone;
                if (dSTZone != null) {
                    dSTZone.writeTo(dataOutput);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("String pool is too large");
        }
    }

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$Recurrence */
    /* loaded from: classes8.dex */
    public static final class Recurrence {
        final String iNameKey;
        final OfYear iOfYear;
        final int iSaveMillis;

        public Recurrence(OfYear ofYear, String str, int i) {
            this.iOfYear = ofYear;
            this.iNameKey = str;
            this.iSaveMillis = i;
        }

        public static Recurrence readFrom(DataInput dataInput) throws IOException {
            return new Recurrence(OfYear.readFrom(dataInput), dataInput.readUTF(), (int) DateTimeZoneBuilder.readMillis(dataInput));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Recurrence)) {
                return false;
            }
            Recurrence recurrence = (Recurrence) obj;
            if (this.iSaveMillis == recurrence.iSaveMillis && this.iNameKey.equals(recurrence.iNameKey) && this.iOfYear.equals(recurrence.iOfYear)) {
                return true;
            }
            return false;
        }

        public String getNameKey() {
            return this.iNameKey;
        }

        public OfYear getOfYear() {
            return this.iOfYear;
        }

        public int getSaveMillis() {
            return this.iSaveMillis;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.iSaveMillis), this.iNameKey, this.iOfYear});
        }

        public long next(long j, int i, int i2) {
            return this.iOfYear.next(j, i, i2);
        }

        public long previous(long j, int i, int i2) {
            return this.iOfYear.previous(j, i, i2);
        }

        public Recurrence rename(String str) {
            return new Recurrence(this.iOfYear, str, this.iSaveMillis);
        }

        public Recurrence renameAppend(String str) {
            return rename((this.iNameKey + str).intern());
        }

        public String toString() {
            return this.iOfYear + " named " + this.iNameKey + " at " + this.iSaveMillis;
        }

        public void writeTo(DataOutput dataOutput) throws IOException {
            this.iOfYear.writeTo(dataOutput);
            dataOutput.writeUTF(this.iNameKey);
            DateTimeZoneBuilder.writeMillis(dataOutput, this.iSaveMillis);
        }
    }

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$Rule */
    /* loaded from: classes8.dex */
    public static final class Rule {
        final int iFromYear;
        final Recurrence iRecurrence;
        final int iToYear;

        public Rule(Recurrence recurrence, int i, int i2) {
            this.iRecurrence = recurrence;
            this.iFromYear = i;
            this.iToYear = i2;
        }

        public int getFromYear() {
            return this.iFromYear;
        }

        public String getNameKey() {
            return this.iRecurrence.getNameKey();
        }

        public OfYear getOfYear() {
            return this.iRecurrence.getOfYear();
        }

        public int getSaveMillis() {
            return this.iRecurrence.getSaveMillis();
        }

        public int getToYear() {
            return this.iToYear;
        }

        public long next(long j, int i, int i2) {
            int i3;
            long j2;
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            int i4 = i + i2;
            if (j == Long.MIN_VALUE) {
                i3 = Integer.MIN_VALUE;
            } else {
                i3 = instanceUTC.year().get(i4 + j);
            }
            if (i3 < this.iFromYear) {
                j2 = (instanceUTC.year().set(0L, this.iFromYear) - i4) - 1;
            } else {
                j2 = j;
            }
            long next = this.iRecurrence.next(j2, i, i2);
            if (next <= j || instanceUTC.year().get(i4 + next) <= this.iToYear) {
                return next;
            }
            return j;
        }

        public String toString() {
            return this.iFromYear + " to " + this.iToYear + " using " + this.iRecurrence;
        }
    }

    private boolean addTransition(ArrayList<Transition> arrayList, Transition transition) {
        int size = arrayList.size();
        if (size == 0) {
            arrayList.add(transition);
            return true;
        }
        int i = size - 1;
        Transition transition2 = arrayList.get(i);
        int i2 = 0;
        if (!transition.isTransitionFrom(transition2)) {
            return false;
        }
        if (size >= 2) {
            i2 = arrayList.get(size - 2).getWallOffset();
        }
        if (transition.getMillis() + transition2.getWallOffset() != transition2.getMillis() + i2) {
            arrayList.add(transition);
            return true;
        }
        return addTransition(arrayList, transition.withMillis(arrayList.remove(i).getMillis()));
    }

    private static DateTimeZone buildFixedZone(String str, String str2, int i, int i2) {
        if ("UTC".equals(str) && str.equals(str2) && i == 0 && i2 == 0) {
            return DateTimeZone.UTC;
        }
        return new FixedDateTimeZone(str, str2, i, i2);
    }

    private RuleSet getLastRuleSet() {
        if (this.iRuleSets.size() == 0) {
            addCutover(Integer.MIN_VALUE, 'w', 1, 1, 0, false, 0);
        }
        ArrayList<RuleSet> arrayList = this.iRuleSets;
        return arrayList.get(arrayList.size() - 1);
    }

    public static DateTimeZone readFrom(InputStream inputStream, String str) throws IOException {
        if (inputStream instanceof DataInput) {
            return readFrom((DataInput) inputStream, str);
        }
        return readFrom((DataInput) new DataInputStream(inputStream), str);
    }

    public static long readMillis(DataInput dataInput) throws IOException {
        long readUnsignedByte;
        long j;
        int readUnsignedByte2 = dataInput.readUnsignedByte();
        int i = readUnsignedByte2 >> 6;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    readUnsignedByte = (readUnsignedByte2 << 26) >> 26;
                    j = ComponentTracker.DEFAULT_TIMEOUT;
                } else {
                    return dataInput.readLong();
                }
            } else {
                readUnsignedByte = ((readUnsignedByte2 << 58) >> 26) | (dataInput.readUnsignedByte() << 24) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8) | dataInput.readUnsignedByte();
                j = 1000;
            }
        } else {
            readUnsignedByte = dataInput.readUnsignedByte() | ((readUnsignedByte2 << 26) >> 2) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8);
            j = 60000;
        }
        return readUnsignedByte * j;
    }

    public static void writeMillis(DataOutput dataOutput, long j) throws IOException {
        int i;
        if (j % ComponentTracker.DEFAULT_TIMEOUT == 0) {
            long j2 = j / ComponentTracker.DEFAULT_TIMEOUT;
            if (((j2 << 58) >> 58) == j2) {
                dataOutput.writeByte((int) (j2 & 63));
                return;
            }
        }
        if (j % 60000 == 0) {
            long j3 = j / 60000;
            if (((j3 << 34) >> 34) == j3) {
                dataOutput.writeInt(((int) (1073741823 & j3)) | 1073741824);
                return;
            }
        }
        if (j % 1000 == 0) {
            long j4 = j / 1000;
            if (((j4 << 26) >> 26) == j4) {
                dataOutput.writeByte(((int) ((j4 >> 32) & 63)) | 128);
                dataOutput.writeInt((int) ((-1) & j4));
                return;
            }
        }
        if (j < 0) {
            i = KotlinVersion.MAX_COMPONENT_VALUE;
        } else {
            i = 192;
        }
        dataOutput.writeByte(i);
        dataOutput.writeLong(j);
    }

    public DateTimeZoneBuilder addCutover(int i, char c, int i2, int i3, int i4, boolean z, int i5) {
        if (this.iRuleSets.size() > 0) {
            OfYear ofYear = new OfYear(c, i2, i3, i4, z, i5);
            ArrayList<RuleSet> arrayList = this.iRuleSets;
            arrayList.get(arrayList.size() - 1).setUpperLimit(i, ofYear);
        }
        this.iRuleSets.add(new RuleSet());
        return this;
    }

    public DateTimeZoneBuilder addRecurringSavings(String str, int i, int i2, int i3, char c, int i4, int i5, int i6, boolean z, int i7) {
        if (i2 <= i3) {
            getLastRuleSet().addRule(new Rule(new Recurrence(new OfYear(c, i4, i5, i6, z, i7), str, i), i2, i3));
        }
        return this;
    }

    public DateTimeZoneBuilder setFixedSavings(String str, int i) {
        getLastRuleSet().setFixedSavings(str, i);
        return this;
    }

    public DateTimeZoneBuilder setStandardOffset(int i) {
        getLastRuleSet().setStandardOffset(i);
        return this;
    }

    public DateTimeZone toDateTimeZone(String str, boolean z) {
        if (str != null) {
            ArrayList<Transition> arrayList = new ArrayList<>();
            int size = this.iRuleSets.size();
            DSTZone dSTZone = null;
            long j = Long.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                RuleSet ruleSet = this.iRuleSets.get(i);
                Transition firstTransition = ruleSet.firstTransition(j);
                if (firstTransition != null) {
                    addTransition(arrayList, firstTransition);
                    long millis = firstTransition.getMillis();
                    int saveMillis = firstTransition.getSaveMillis();
                    RuleSet ruleSet2 = new RuleSet(ruleSet);
                    while (true) {
                        Transition nextTransition = ruleSet2.nextTransition(millis, saveMillis);
                        if (nextTransition == null || (addTransition(arrayList, nextTransition) && dSTZone != null)) {
                            break;
                        }
                        long millis2 = nextTransition.getMillis();
                        int saveMillis2 = nextTransition.getSaveMillis();
                        if (dSTZone == null && i == size - 1) {
                            dSTZone = ruleSet2.buildTailZone(str);
                        }
                        saveMillis = saveMillis2;
                        millis = millis2;
                    }
                    j = ruleSet2.getUpperLimit(saveMillis);
                }
            }
            if (arrayList.size() == 0) {
                if (dSTZone != null) {
                    return dSTZone;
                }
                return buildFixedZone(str, "UTC", 0, 0);
            } else if (arrayList.size() == 1 && dSTZone == null) {
                Transition transition = arrayList.get(0);
                return buildFixedZone(str, transition.getNameKey(), transition.getWallOffset(), transition.getStandardOffset());
            } else {
                PrecalculatedZone create = PrecalculatedZone.create(str, z, arrayList, dSTZone);
                if (create.isCachable()) {
                    return CachedDateTimeZone.forZone(create);
                }
                return create;
            }
        }
        throw new IllegalArgumentException();
    }

    public void writeTo(String str, OutputStream outputStream) throws IOException {
        if (outputStream instanceof DataOutput) {
            writeTo(str, (DataOutput) outputStream);
            return;
        }
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        writeTo(str, (DataOutput) dataOutputStream);
        dataOutputStream.flush();
    }

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$RuleSet */
    /* loaded from: classes8.dex */
    public static final class RuleSet {
        private static final int YEAR_LIMIT = ISOChronology.getInstanceUTC().year().get(DateTimeUtils.currentTimeMillis()) + 100;
        private String iInitialNameKey;
        private int iInitialSaveMillis;
        private ArrayList<Rule> iRules;
        private int iStandardOffset;
        private OfYear iUpperOfYear;
        private int iUpperYear;

        public RuleSet() {
            this.iRules = new ArrayList<>(10);
            this.iUpperYear = Integer.MAX_VALUE;
        }

        public void addRule(Rule rule) {
            if (!this.iRules.contains(rule)) {
                this.iRules.add(rule);
            }
        }

        public DSTZone buildTailZone(String str) {
            if (this.iRules.size() == 2) {
                Rule rule = this.iRules.get(0);
                Rule rule2 = this.iRules.get(1);
                if (rule.getToYear() == Integer.MAX_VALUE && rule2.getToYear() == Integer.MAX_VALUE) {
                    return new DSTZone(str, this.iStandardOffset, rule.iRecurrence, rule2.iRecurrence);
                }
                return null;
            }
            return null;
        }

        public Transition firstTransition(long j) {
            String str = this.iInitialNameKey;
            if (str != null) {
                int i = this.iStandardOffset;
                return new Transition(j, str, i + this.iInitialSaveMillis, i);
            }
            ArrayList<Rule> arrayList = new ArrayList<>(this.iRules);
            long j2 = Long.MIN_VALUE;
            int i2 = 0;
            Transition transition = null;
            while (true) {
                Transition nextTransition = nextTransition(j2, i2);
                if (nextTransition == null) {
                    break;
                }
                long millis = nextTransition.getMillis();
                int i3 = (millis > j ? 1 : (millis == j ? 0 : -1));
                if (i3 == 0) {
                    transition = new Transition(j, nextTransition);
                    break;
                } else if (i3 > 0) {
                    if (transition == null) {
                        Iterator<Rule> it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Rule next = it.next();
                            if (next.getSaveMillis() == 0) {
                                transition = new Transition(j, next, this.iStandardOffset);
                                break;
                            }
                        }
                    }
                    if (transition == null) {
                        String nameKey = nextTransition.getNameKey();
                        int i4 = this.iStandardOffset;
                        transition = new Transition(j, nameKey, i4, i4);
                    }
                } else {
                    transition = new Transition(j, nextTransition);
                    i2 = nextTransition.getSaveMillis();
                    j2 = millis;
                }
            }
            this.iRules = arrayList;
            return transition;
        }

        public int getStandardOffset() {
            return this.iStandardOffset;
        }

        public long getUpperLimit(int i) {
            int i2 = this.iUpperYear;
            if (i2 == Integer.MAX_VALUE) {
                return LongCompanionObject.MAX_VALUE;
            }
            return this.iUpperOfYear.setInstant(i2, this.iStandardOffset, i);
        }

        public Transition nextTransition(long j, int i) {
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            Iterator<Rule> it = this.iRules.iterator();
            long j2 = LongCompanionObject.MAX_VALUE;
            Rule rule = null;
            while (it.hasNext()) {
                Rule next = it.next();
                long next2 = next.next(j, this.iStandardOffset, i);
                if (next2 <= j) {
                    it.remove();
                } else if (next2 <= j2) {
                    rule = next;
                    j2 = next2;
                }
            }
            if (rule == null || instanceUTC.year().get(j2) >= YEAR_LIMIT) {
                return null;
            }
            int i2 = this.iUpperYear;
            if (i2 < Integer.MAX_VALUE && j2 >= this.iUpperOfYear.setInstant(i2, this.iStandardOffset, i)) {
                return null;
            }
            return new Transition(j2, rule, this.iStandardOffset);
        }

        public void setFixedSavings(String str, int i) {
            this.iInitialNameKey = str;
            this.iInitialSaveMillis = i;
        }

        public void setStandardOffset(int i) {
            this.iStandardOffset = i;
        }

        public void setUpperLimit(int i, OfYear ofYear) {
            this.iUpperYear = i;
            this.iUpperOfYear = ofYear;
        }

        public String toString() {
            return this.iInitialNameKey + " initial: " + this.iInitialSaveMillis + " std: " + this.iStandardOffset + " upper: " + this.iUpperYear + " " + this.iUpperOfYear + " " + this.iRules;
        }

        public RuleSet(RuleSet ruleSet) {
            this.iStandardOffset = ruleSet.iStandardOffset;
            this.iRules = new ArrayList<>(ruleSet.iRules);
            this.iInitialNameKey = ruleSet.iInitialNameKey;
            this.iInitialSaveMillis = ruleSet.iInitialSaveMillis;
            this.iUpperYear = ruleSet.iUpperYear;
            this.iUpperOfYear = ruleSet.iUpperOfYear;
        }
    }

    public static DateTimeZone readFrom(DataInput dataInput, String str) throws IOException {
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte != 67) {
            if (readUnsignedByte != 70) {
                if (readUnsignedByte == 80) {
                    return PrecalculatedZone.readFrom(dataInput, str);
                }
                throw new IOException("Invalid encoding");
            }
            FixedDateTimeZone fixedDateTimeZone = new FixedDateTimeZone(str, dataInput.readUTF(), (int) readMillis(dataInput), (int) readMillis(dataInput));
            DateTimeZone dateTimeZone = DateTimeZone.UTC;
            return fixedDateTimeZone.equals(dateTimeZone) ? dateTimeZone : fixedDateTimeZone;
        }
        return CachedDateTimeZone.forZone(PrecalculatedZone.readFrom(dataInput, str));
    }

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$Transition */
    /* loaded from: classes8.dex */
    public static final class Transition {
        private final long iMillis;
        private final String iNameKey;
        private final int iStandardOffset;
        private final int iWallOffset;

        public Transition(long j, Transition transition) {
            this.iMillis = j;
            this.iNameKey = transition.iNameKey;
            this.iWallOffset = transition.iWallOffset;
            this.iStandardOffset = transition.iStandardOffset;
        }

        public long getMillis() {
            return this.iMillis;
        }

        public String getNameKey() {
            return this.iNameKey;
        }

        public int getSaveMillis() {
            return this.iWallOffset - this.iStandardOffset;
        }

        public int getStandardOffset() {
            return this.iStandardOffset;
        }

        public int getWallOffset() {
            return this.iWallOffset;
        }

        public boolean isTransitionFrom(Transition transition) {
            if (transition == null) {
                return true;
            }
            if (this.iMillis > transition.iMillis && (this.iWallOffset != transition.iWallOffset || this.iStandardOffset != transition.iStandardOffset || !this.iNameKey.equals(transition.iNameKey))) {
                return true;
            }
            return false;
        }

        public String toString() {
            return new DateTime(this.iMillis, DateTimeZone.UTC) + " " + this.iStandardOffset + " " + this.iWallOffset;
        }

        public Transition withMillis(long j) {
            return new Transition(j, this.iNameKey, this.iWallOffset, this.iStandardOffset);
        }

        public Transition(long j, Rule rule, int i) {
            this.iMillis = j;
            this.iNameKey = rule.getNameKey();
            this.iWallOffset = rule.getSaveMillis() + i;
            this.iStandardOffset = i;
        }

        public Transition(long j, String str, int i, int i2) {
            this.iMillis = j;
            this.iNameKey = str;
            this.iWallOffset = i;
            this.iStandardOffset = i2;
        }
    }

    public void writeTo(String str, DataOutput dataOutput) throws IOException {
        DateTimeZone dateTimeZone = toDateTimeZone(str, false);
        if (dateTimeZone instanceof FixedDateTimeZone) {
            dataOutput.writeByte(70);
            dataOutput.writeUTF(dateTimeZone.getNameKey(0L));
            writeMillis(dataOutput, dateTimeZone.getOffset(0L));
            writeMillis(dataOutput, dateTimeZone.getStandardOffset(0L));
            return;
        }
        if (dateTimeZone instanceof CachedDateTimeZone) {
            dataOutput.writeByte(67);
            dateTimeZone = ((CachedDateTimeZone) dateTimeZone).getUncachedZone();
        } else {
            dataOutput.writeByte(80);
        }
        ((PrecalculatedZone) dateTimeZone).writeTo(dataOutput);
    }
}
