package zendesk.support.suas;
/* loaded from: classes8.dex */
public class Filters {
    public static final Filter DEFAULT = new DefaultFilter();
    public static final Filter EQUALS = new EqualsFilter();

    /* loaded from: classes8.dex */
    public static class DefaultFilter implements Filter {
        private DefaultFilter() {
        }

        @Override // zendesk.support.suas.Filter
        public boolean filter(Object obj, Object obj2) {
            return true;
        }
    }

    /* loaded from: classes8.dex */
    public static class EqualsFilter implements Filter {
        private EqualsFilter() {
        }

        @Override // zendesk.support.suas.Filter
        public boolean filter(Object obj, Object obj2) {
            return !obj.equals(obj2);
        }
    }

    private Filters() {
    }
}
