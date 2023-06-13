package co.bird.android.model;

import io.reactivex.AbstractC23461c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lio/reactivex/c;", "invoke", "()Lio/reactivex/c;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class BirdBikeVehicleConnection$refreshStatus$1 extends Lambda implements Function0<AbstractC23461c> {
    final /* synthetic */ BirdBikeVehicleConnection this$0;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lio/reactivex/c;", "invoke", "()Lio/reactivex/c;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.model.BirdBikeVehicleConnection$refreshStatus$1$1 */
    /* loaded from: classes4.dex */
    public static final class C162471 extends Lambda implements Function0<AbstractC23461c> {
        final /* synthetic */ BirdBikeVehicleConnection this$0;

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lio/reactivex/c;", "invoke", "()Lio/reactivex/c;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.model.BirdBikeVehicleConnection$refreshStatus$1$1$1 */
        /* loaded from: classes4.dex */
        public static final class C162481 extends Lambda implements Function0<AbstractC23461c> {
            final /* synthetic */ BirdBikeVehicleConnection this$0;

            @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lio/reactivex/c;", "invoke", "()Lio/reactivex/c;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: co.bird.android.model.BirdBikeVehicleConnection$refreshStatus$1$1$1$1 */
            /* loaded from: classes4.dex */
            public static final class C162491 extends Lambda implements Function0<AbstractC23461c> {
                final /* synthetic */ BirdBikeVehicleConnection this$0;

                @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lio/reactivex/c;", "invoke", "()Lio/reactivex/c;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                /* renamed from: co.bird.android.model.BirdBikeVehicleConnection$refreshStatus$1$1$1$1$1 */
                /* loaded from: classes4.dex */
                public static final class C162501 extends Lambda implements Function0<AbstractC23461c> {
                    final /* synthetic */ BirdBikeVehicleConnection this$0;

                    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lio/reactivex/c;", "invoke", "()Lio/reactivex/c;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                    /* renamed from: co.bird.android.model.BirdBikeVehicleConnection$refreshStatus$1$1$1$1$1$1 */
                    /* loaded from: classes4.dex */
                    public static final class C162511 extends Lambda implements Function0<AbstractC23461c> {
                        final /* synthetic */ BirdBikeVehicleConnection this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C162511(BirdBikeVehicleConnection birdBikeVehicleConnection) {
                            super(0);
                            this.this$0 = birdBikeVehicleConnection;
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final AbstractC23461c invoke() {
                            return BirdBikeVehicleConnection.writeCommandData$default(this.this$0, Command.BIRD_BIKE_QUERY_MOTOR_LOCK, 200L, null, 4, null);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C162501(BirdBikeVehicleConnection birdBikeVehicleConnection) {
                        super(0);
                        this.this$0 = birdBikeVehicleConnection;
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final AbstractC23461c invoke() {
                        AbstractC23461c writeCommandData;
                        BirdBikeVehicleConnection birdBikeVehicleConnection = this.this$0;
                        writeCommandData = birdBikeVehicleConnection.writeCommandData(Command.BIRD_BIKE_QUERY_BMS_FIRMWARE, 200L, new C162511(birdBikeVehicleConnection));
                        return writeCommandData;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C162491(BirdBikeVehicleConnection birdBikeVehicleConnection) {
                    super(0);
                    this.this$0 = birdBikeVehicleConnection;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final AbstractC23461c invoke() {
                    AbstractC23461c writeCommandData;
                    BirdBikeVehicleConnection birdBikeVehicleConnection = this.this$0;
                    writeCommandData = birdBikeVehicleConnection.writeCommandData(Command.BIRD_BIKE_QUERY_ECU_FIRMWARE, 200L, new C162501(birdBikeVehicleConnection));
                    return writeCommandData;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C162481(BirdBikeVehicleConnection birdBikeVehicleConnection) {
                super(0);
                this.this$0 = birdBikeVehicleConnection;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AbstractC23461c invoke() {
                AbstractC23461c writeCommandData;
                BirdBikeVehicleConnection birdBikeVehicleConnection = this.this$0;
                writeCommandData = birdBikeVehicleConnection.writeCommandData(Command.BIRD_BIKE_QUERY_DISPLAY_FIRMWARE, 200L, new C162491(birdBikeVehicleConnection));
                return writeCommandData;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C162471(BirdBikeVehicleConnection birdBikeVehicleConnection) {
            super(0);
            this.this$0 = birdBikeVehicleConnection;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC23461c invoke() {
            AbstractC23461c writeCommandData;
            BirdBikeVehicleConnection birdBikeVehicleConnection = this.this$0;
            writeCommandData = birdBikeVehicleConnection.writeCommandData(Command.BIRD_BIKE_READ_HEADLIGHT_STATE, 200L, new C162481(birdBikeVehicleConnection));
            return writeCommandData;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirdBikeVehicleConnection$refreshStatus$1(BirdBikeVehicleConnection birdBikeVehicleConnection) {
        super(0);
        this.this$0 = birdBikeVehicleConnection;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AbstractC23461c invoke() {
        AbstractC23461c writeCommandData;
        BirdBikeVehicleConnection birdBikeVehicleConnection = this.this$0;
        writeCommandData = birdBikeVehicleConnection.writeCommandData(Command.BIRD_BIKE_QUERY_RIDE_DATA, 200L, new C162471(birdBikeVehicleConnection));
        return writeCommandData;
    }
}
