.class public final enum Lio/reactivex/internal/operators/flowable/F;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/reactivex/internal/operators/flowable/F;",
        ">;",
        "Lio/reactivex/functions/g<",
        "LoT5;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lio/reactivex/internal/operators/flowable/F;

.field public static final synthetic c:[Lio/reactivex/internal/operators/flowable/F;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/reactivex/internal/operators/flowable/F;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/reactivex/internal/operators/flowable/F;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/reactivex/internal/operators/flowable/F;->b:Lio/reactivex/internal/operators/flowable/F;

    const/4 v1, 0x1

    new-array v1, v1, [Lio/reactivex/internal/operators/flowable/F;

    aput-object v0, v1, v2

    sput-object v1, Lio/reactivex/internal/operators/flowable/F;->c:[Lio/reactivex/internal/operators/flowable/F;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/reactivex/internal/operators/flowable/F;
    .locals 1

    const-class v0, Lio/reactivex/internal/operators/flowable/F;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/reactivex/internal/operators/flowable/F;

    return-object p0
.end method

.method public static values()[Lio/reactivex/internal/operators/flowable/F;
    .locals 1

    sget-object v0, Lio/reactivex/internal/operators/flowable/F;->c:[Lio/reactivex/internal/operators/flowable/F;

    invoke-virtual {v0}, [Lio/reactivex/internal/operators/flowable/F;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/reactivex/internal/operators/flowable/F;

    return-object v0
.end method


# virtual methods
.method public a(LoT5;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, LoT5;->o(J)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    check-cast p1, LoT5;

    invoke-virtual {p0, p1}, Lio/reactivex/internal/operators/flowable/F;->a(LoT5;)V

    return-void
.end method
