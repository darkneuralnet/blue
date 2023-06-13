package zendesk.core;
/* loaded from: classes8.dex */
class BlipsPermissions {
    private boolean behavioural;
    private boolean pathfinder;
    private boolean required;

    /* renamed from: zendesk.core.BlipsPermissions$1 */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C311431 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$core$BlipsGroup;

        static {
            int[] iArr = new int[BlipsGroup.values().length];
            $SwitchMap$zendesk$core$BlipsGroup = iArr;
            try {
                iArr[BlipsGroup.REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$zendesk$core$BlipsGroup[BlipsGroup.BEHAVIOURAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$zendesk$core$BlipsGroup[BlipsGroup.PATHFINDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public BlipsPermissions(boolean z, boolean z2, boolean z3) {
        this.required = z;
        this.behavioural = z2;
        this.pathfinder = z3;
    }

    public boolean isEnabled(BlipsGroup blipsGroup) {
        int i = C311431.$SwitchMap$zendesk$core$BlipsGroup[blipsGroup.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                return this.pathfinder;
            }
            return this.behavioural;
        }
        return this.required;
    }

    public BlipsPermissions() {
        this(false, false, false);
    }
}
