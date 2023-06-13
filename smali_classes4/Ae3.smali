.class public abstract LAe3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LAe3$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\'\u0018\u0000 \u00082\u00020\u0001:\u0001\u0008B\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\'\u00a8\u0006\t"
    }
    d2 = {
        "LAe3;",
        "",
        "Lye3;",
        "impl",
        "Lue3;",
        "b",
        "<init>",
        "()V",
        "a",
        "co.bird.android.manager.offer"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:LAe3$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LAe3$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LAe3$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LAe3;->a:LAe3$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(LMN4;)Lpe3;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, LAe3;->a:LAe3$a;

    invoke-virtual {v0, p0}, LAe3$a;->a(LMN4;)Lpe3;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract b(Lye3;)Lue3;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method
