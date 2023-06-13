package co.bird.android.model.binary;
/* loaded from: classes4.dex */
public abstract class ValueGetter {
    ByteGetter data;
    public final byte endian;
    int position;

    /* loaded from: classes4.dex */
    public static class NDR extends ValueGetter {
        public static final byte NUMBER = 1;

        public NDR(ByteGetter byteGetter) {
            super(byteGetter, (byte) 1);
        }

        @Override // co.bird.android.model.binary.ValueGetter
        public int getInt(int i) {
            return (this.data.get(i + 3) << 24) + (this.data.get(i + 2) << 16) + (this.data.get(i + 1) << 8) + this.data.get(i);
        }

        @Override // co.bird.android.model.binary.ValueGetter
        public long getLong(int i) {
            return (this.data.get(i + 7) << 56) + (this.data.get(i + 6) << 48) + (this.data.get(i + 5) << 40) + (this.data.get(i + 4) << 32) + (this.data.get(i + 3) << 24) + (this.data.get(i + 2) << 16) + (this.data.get(i + 1) << 8) + (this.data.get(i) << 0);
        }
    }

    /* loaded from: classes4.dex */
    public static class XDR extends ValueGetter {
        public static final byte NUMBER = 0;

        public XDR(ByteGetter byteGetter) {
            super(byteGetter, (byte) 0);
        }

        @Override // co.bird.android.model.binary.ValueGetter
        public int getInt(int i) {
            return (this.data.get(i) << 24) + (this.data.get(i + 1) << 16) + (this.data.get(i + 2) << 8) + this.data.get(i + 3);
        }

        @Override // co.bird.android.model.binary.ValueGetter
        public long getLong(int i) {
            return (this.data.get(i) << 56) + (this.data.get(i + 1) << 48) + (this.data.get(i + 2) << 40) + (this.data.get(i + 3) << 32) + (this.data.get(i + 4) << 24) + (this.data.get(i + 5) << 16) + (this.data.get(i + 6) << 8) + (this.data.get(i + 7) << 0);
        }
    }

    public ValueGetter(ByteGetter byteGetter, byte b) {
        this.data = byteGetter;
        this.endian = b;
    }

    public byte getByte() {
        ByteGetter byteGetter = this.data;
        int i = this.position;
        this.position = i + 1;
        return (byte) byteGetter.get(i);
    }

    public double getDouble() {
        return Double.longBitsToDouble(getLong());
    }

    public int getInt() {
        int i = getInt(this.position);
        this.position += 4;
        return i;
    }

    public abstract int getInt(int i);

    public long getLong() {
        long j = getLong(this.position);
        this.position += 8;
        return j;
    }

    public abstract long getLong(int i);
}
