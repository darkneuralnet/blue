package co.bird.android.model.binary;

import kotlin.UByte;
/* loaded from: classes4.dex */
public abstract class ByteSetter {

    /* loaded from: classes4.dex */
    public static class BinaryByteSetter extends ByteSetter {
        private byte[] array;

        public BinaryByteSetter(int i) {
            this.array = new byte[i];
        }

        public byte[] result() {
            return this.array;
        }

        @Override // co.bird.android.model.binary.ByteSetter
        public void set(byte b, int i) {
            this.array[i] = b;
        }

        public String toString() {
            char[] cArr = new char[this.array.length];
            int i = 0;
            while (true) {
                byte[] bArr = this.array;
                if (i < bArr.length) {
                    cArr[i] = (char) (bArr[i] & UByte.MAX_VALUE);
                    i++;
                } else {
                    return new String(cArr);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class StringByteSetter extends ByteSetter {
        protected static final char[] hextypes = "0123456789ABCDEF".toCharArray();
        private char[] rep;

        public StringByteSetter(int i) {
            this.rep = new char[i * 2];
        }

        public String result() {
            return new String(this.rep);
        }

        public char[] resultAsArray() {
            return this.rep;
        }

        @Override // co.bird.android.model.binary.ByteSetter
        public void set(byte b, int i) {
            int i2 = i * 2;
            char[] cArr = this.rep;
            char[] cArr2 = hextypes;
            cArr[i2] = cArr2[(b >>> 4) & 15];
            cArr[i2 + 1] = cArr2[b & 15];
        }

        public String toString() {
            return new String(this.rep);
        }
    }

    public abstract void set(byte b, int i);
}
