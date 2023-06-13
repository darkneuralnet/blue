package zendesk.support.request;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C11905h;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zendesk.support.request.CellType;
import zendesk.support.suas.Listener;
import zendesk.support.suas.State;
import zendesk.support.suas.StateSelector;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ComponentRequestAdapter implements Listener<List<CellType.Base>> {
    private static final long UPDATE_TIME_WINDOW = 200;
    private final InterfaceC32011Bs2 listUpdateCallback;
    private final RecyclerView recyclerView;
    private final RequestAdapterSelector requestAdapterSelector;
    private final List<CellType.Base> requestMessageList;
    private Runnable updateRunnable;

    /* loaded from: classes8.dex */
    public static class DiffCalculator extends C11905h.AbstractC11907b {
        private final List<CellType.Base> newList;
        private final List<CellType.Base> oldList;

        @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
        public boolean areContentsTheSame(int i, int i2) {
            return this.oldList.get(i).areContentsTheSame(this.newList.get(i2));
        }

        @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
        public boolean areItemsTheSame(int i, int i2) {
            return this.oldList.get(i).getUniqueId() == this.newList.get(i2).getUniqueId();
        }

        @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
        public int getNewListSize() {
            return this.newList.size();
        }

        @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
        public int getOldListSize() {
            return this.oldList.size();
        }

        private DiffCalculator(List<CellType.Base> list, List<CellType.Base> list2) {
            this.oldList = list;
            this.newList = list2;
        }
    }

    /* loaded from: classes8.dex */
    public static class RequestAdapter extends RecyclerView.AbstractC11843h<RequestViewHolder> {
        private final ComponentRequestAdapter dataSource;
        private int lastPosition = -1;

        public RequestAdapter(ComponentRequestAdapter componentRequestAdapter) {
            setHasStableIds(true);
            this.dataSource = componentRequestAdapter;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
        public int getItemCount() {
            return this.dataSource.getMessageCount();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
        public long getItemId(int i) {
            return this.dataSource.getMessageForPos(i).getUniqueId();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
        public int getItemViewType(int i) {
            return this.dataSource.getMessageForPos(i).getLayoutId();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
        @SuppressLint({"RecyclerView"})
        public void onBindViewHolder(RequestViewHolder requestViewHolder, int i) {
            this.dataSource.getMessageForPos(i).bind(requestViewHolder);
            int i2 = this.lastPosition;
            if (i > i2 && i2 != -1) {
                this.lastPosition = i;
                requestViewHolder.startAnimation();
            }
            if (this.lastPosition == -1) {
                this.lastPosition = i;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
        public RequestViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new RequestViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
        public void onViewDetachedFromWindow(RequestViewHolder requestViewHolder) {
            super.onViewDetachedFromWindow((RequestAdapter) requestViewHolder);
            requestViewHolder.clearAnimation();
        }
    }

    /* loaded from: classes8.dex */
    public static class RequestAdapterSelector implements StateSelector<List<CellType.Base>> {
        private final CellFactory messageFactory;

        public RequestAdapterSelector(CellFactory cellFactory) {
            this.messageFactory = cellFactory;
        }

        @Override // zendesk.support.suas.StateSelector
        public List<CellType.Base> selectData(State state) {
            StateConversation fromState = StateConversation.fromState(state);
            StateSettings settings = StateConfig.fromState(state).getSettings();
            return this.messageFactory.generateCells(fromState.getMessages(), fromState.getUsers(), fromState.getStatus(), settings.getSystemMessage());
        }
    }

    /* loaded from: classes8.dex */
    public static class RequestViewHolder extends RecyclerView.AbstractC11834D {
        private static final long ANIMATION_DURATION = 250;
        private static final float ANIMATION_HEIGHT_RATIO = 0.6666667f;
        private static final TimeInterpolator TIME_INTERPOLATOR = C43828kJ3.m29072a(0.2f, 0.0f, 0.4f, 1.0f);
        private ValueAnimator animation;
        @SuppressLint({"UseSparseArrays"})
        private final Map<Integer, View> viewCache;

        public RequestViewHolder(View view) {
            super(view);
            this.viewCache = new HashMap();
        }

        public void clearAnimation() {
            ValueAnimator valueAnimator = this.animation;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.itemView.setTranslationY(0.0f);
            }
        }

        public <E extends View> E findCachedView(int i) {
            E e;
            synchronized (this.viewCache) {
                if (this.viewCache.containsKey(Integer.valueOf(i))) {
                    e = (E) this.viewCache.get(Integer.valueOf(i));
                } else {
                    View findViewById = this.itemView.findViewById(i);
                    this.viewCache.put(Integer.valueOf(i), findViewById);
                    e = (E) findViewById;
                }
            }
            return e;
        }

        public void startAnimation() {
            int measuredHeight = this.itemView.getMeasuredHeight();
            if (measuredHeight == 0) {
                this.itemView.measure(0, 0);
                measuredHeight = this.itemView.getMeasuredHeight();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(measuredHeight * ANIMATION_HEIGHT_RATIO, 0.0f);
            this.animation = ofFloat;
            ofFloat.setInterpolator(TIME_INTERPOLATOR);
            this.animation.setDuration(250L);
            this.animation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: zendesk.support.request.ComponentRequestAdapter.RequestViewHolder.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    RequestViewHolder.this.itemView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            this.animation.start();
        }
    }

    public ComponentRequestAdapter(InterfaceC32011Bs2 interfaceC32011Bs2, CellFactory cellFactory, RecyclerView recyclerView) {
        this.updateRunnable = null;
        this.listUpdateCallback = interfaceC32011Bs2;
        this.recyclerView = recyclerView;
        this.requestMessageList = new ArrayList();
        this.requestAdapterSelector = new RequestAdapterSelector(cellFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateDataSet(List<CellType.Base> list, List<CellType.Base> list2) {
        C11905h.C11910e m66273c = C11905h.m66273c(new DiffCalculator(list, list2), true);
        this.requestMessageList.clear();
        this.requestMessageList.addAll(list2);
        m66273c.m66262c(this.listUpdateCallback);
    }

    public int getMessageCount() {
        return this.requestMessageList.size();
    }

    public CellType.Base getMessageForPos(int i) {
        return this.requestMessageList.get(i);
    }

    public StateSelector<List<CellType.Base>> getSelector() {
        return this.requestAdapterSelector;
    }

    @Override // zendesk.support.suas.Listener
    public void update(final List<CellType.Base> list) {
        this.recyclerView.removeCallbacks(this.updateRunnable);
        Runnable runnable = new Runnable() { // from class: zendesk.support.request.ComponentRequestAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                ComponentRequestAdapter.this.updateDataSet(C43505jm0.m29954c(ComponentRequestAdapter.this.requestMessageList), C43505jm0.m29954c(list));
            }
        };
        this.updateRunnable = runnable;
        this.recyclerView.postDelayed(runnable, 200L);
    }

    public ComponentRequestAdapter(List<CellType.Base> list, InterfaceC32011Bs2 interfaceC32011Bs2, RequestAdapterSelector requestAdapterSelector, RecyclerView recyclerView) {
        this.updateRunnable = null;
        this.requestMessageList = list;
        this.listUpdateCallback = interfaceC32011Bs2;
        this.requestAdapterSelector = requestAdapterSelector;
        this.recyclerView = recyclerView;
    }
}
