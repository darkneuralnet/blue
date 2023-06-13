package co.bird.android.model.binary;

import kotlin.UByte;
/* loaded from: classes4.dex */
public abstract class ByteGetter {

    /* loaded from: classes4.dex */
    public static class BinaryByteGetter extends ByteGetter {
        private byte[] array;

        public BinaryByteGetter(byte[] bArr) {
            this.array = bArr;
        }

        @Override // co.bird.android.model.binary.ByteGetter
        public int get(int i) {
            return this.array[i] & UByte.MAX_VALUE;
        }
    }

    /* loaded from: classes4.dex */
    public static class StringByteGetter extends ByteGetter {
        private String rep;

        public StringByteGetter(String str) {
            this.rep = str;
        }

        public static byte unhex(char c) {
            int i;
            if (c < '0' || c > '9') {
                char c2 = 'A';
                if (c < 'A' || c > 'F') {
                    c2 = 'a';
                    if (c < 'a' || c > 'f') {
                        throw new IllegalArgumentException("No valid Hex char " + c);
                    }
                }
                i = (c - c2) + 10;
            } else {
                i = c - '0';
            }
            return (byte) i;
        }

        @Override // co.bird.android.model.binary.ByteGetter
        public int get(int i) {
            int i2 = i * 2;
            return (unhex(this.rep.charAt(i2)) << 4) + unhex(this.rep.charAt(i2 + 1));
        }
    }

    public abstract int get(int i);
}
