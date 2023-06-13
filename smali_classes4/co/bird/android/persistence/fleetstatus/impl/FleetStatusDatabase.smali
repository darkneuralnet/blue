.class public abstract Lco/bird/android/persistence/fleetstatus/impl/FleetStatusDatabase;
.super LEb5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/persistence/fleetstatus/impl/FleetStatusDatabase$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\'\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0008\u0010\u0003\u001a\u00020\u0002H&J\u0008\u0010\u0005\u001a\u00020\u0004H&J\u0008\u0010\u0007\u001a\u00020\u0006H&J\u0008\u0010\t\u001a\u00020\u0008H&J\u0008\u0010\u000b\u001a\u00020\nH&\u00a8\u0006\u0010"
    }
    d2 = {
        "Lco/bird/android/persistence/fleetstatus/impl/FleetStatusDatabase;",
        "LEb5;",
        "Lvr1;",
        "G",
        "Lwq1;",
        "F",
        "Lwo1;",
        "C",
        "LXo1;",
        "D",
        "Lfp1;",
        "E",
        "<init>",
        "()V",
        "p",
        "a",
        "co.bird.android.lib.persistence.fleet-status.impl"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final p:Lco/bird/android/persistence/fleetstatus/impl/FleetStatusDatabase$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/persistence/fleetstatus/impl/FleetStatusDatabase$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/persistence/fleetstatus/impl/FleetStatusDatabase$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/persistence/fleetstatus/impl/FleetStatusDatabase;->p:Lco/bird/android/persistence/fleetstatus/impl/FleetStatusDatabase$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LEb5;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract C()Lwo1;
.end method

.method public abstract D()LXo1;
.end method

.method public abstract E()Lfp1;
.end method

.method public abstract F()Lwq1;
.end method

.method public abstract G()Lvr1;
.end method
