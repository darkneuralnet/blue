.class public abstract Lco/bird/android/persistence/operatororderview/OperatorOrderViewDatabase;
.super LEb5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/persistence/operatororderview/OperatorOrderViewDatabase$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\'\u0018\u0000 \u000c2\u00020\u0001:\u0001\rB\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "Lco/bird/android/persistence/operatororderview/OperatorOrderViewDatabase;",
        "LEb5;",
        "Lbq3;",
        "D",
        "()Lbq3;",
        "sectionDao",
        "LSp3;",
        "C",
        "()LSp3;",
        "orderDao",
        "<init>",
        "()V",
        "p",
        "a",
        "co.bird.android.lib.persistence.operator-order-view.impl"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final p:Lco/bird/android/persistence/operatororderview/OperatorOrderViewDatabase$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/persistence/operatororderview/OperatorOrderViewDatabase$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/persistence/operatororderview/OperatorOrderViewDatabase$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/persistence/operatororderview/OperatorOrderViewDatabase;->p:Lco/bird/android/persistence/operatororderview/OperatorOrderViewDatabase$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LEb5;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract C()LSp3;
.end method

.method public abstract D()Lbq3;
.end method
