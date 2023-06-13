package co.bird.android.model.binary;

import ch.qos.logback.core.joran.action.ActionConst;
/* loaded from: classes4.dex */
public abstract class ValueSetter {
    ByteSetter data;
    public final byte endian;
    int position = 0;

    /* loaded from: classes4.dex */
    public static class NDR extends ValueSetter {
        public static final byte NUMBER = 1;

        public NDR(ByteSetter byteSetter) {
            super(byteSetter, (byte) 1);
        }

        @Override // co.bird.android.model.binary.ValueSetter
        public void setInt(int i, int i2) {
            this.data.set((byte) (i >>> 24), i2 + 3);
            this.data.set((byte) (i >>> 16), i2 + 2);
            this.data.set((byte) (i >>> 8), i2 + 1);
            this.data.set((byte) i, i2);
        }

        @Override // co.bird.android.model.binary.ValueSetter
        public void setLong(long j, int i) {
            this.data.set((byte) (j >>> 56), i + 7);
            this.data.set((byte) (j >>> 48), i + 6);
            this.data.set((byte) (j >>> 40), i + 5);
            this.data.set((byte) (j >>> 32), i + 4);
            this.data.set((byte) (j >>> 24), i + 3);
            this.data.set((byte) (j >>> 16), i + 2);
            this.data.set((byte) (j >>> 8), i + 1);
            this.data.set((byte) j, i);
        }
    }

    /* loaded from: classes4.dex */
    public static class XDR extends ValueSetter {
        public static final byte NUMBER = 0;

        public XDR(ByteSetter byteSetter) {
            super(byteSetter, (byte) 0);
        }

        @Override // co.bird.android.model.binary.ValueSetter
        public void setInt(int i, int i2) {
            this.data.set((byte) (i >>> 24), i2);
            this.data.set((byte) (i >>> 16), i2 + 1);
            this.data.set((byte) (i >>> 8), i2 + 2);
            this.data.set((byte) i, i2 + 3);
        }

        @Override // co.bird.android.model.binary.ValueSetter
        public void setLong(long j, int i) {
            this.data.set((byte) (j >>> 56), i);
            this.data.set((byte) (j >>> 48), i + 1);
            this.data.set((byte) (j >>> 40), i + 2);
            this.data.set((byte) (j >>> 32), i + 3);
            this.data.set((byte) (j >>> 24), i + 4);
            this.data.set((byte) (j >>> 16), i + 5);
            this.data.set((byte) (j >>> 8), i + 6);
            this.data.set((byte) j, i + 7);
        }
    }

    public ValueSetter(ByteSetter byteSetter, byte b) {
        this.data = byteSetter;
        this.endian = b;
    }

    public void setByte(byte b) {
        this.data.set(b, this.position);
        this.position++;
    }

    public void setDouble(double d) {
        setLong(Double.doubleToLongBits(d));
    }

    public void setInt(int i) {
        setInt(i, this.position);
        this.position += 4;
    }

    public abstract void setInt(int i, int i2);

    public void setLong(long j) {
        setLong(j, this.position);
        this.position += 8;
    }

    public abstract void setLong(long j, int i);

    public String toString() {
        String str;
        String name = getClass().getName();
        String substring = name.substring(name.lastIndexOf(46) + 1);
        ByteSetter byteSetter = this.data;
        if (byteSetter == null) {
            str = ActionConst.NULL;
        } else {
            str = byteSetter.toString() + "')";
        }
        return substring + "('" + str;
    }
}
