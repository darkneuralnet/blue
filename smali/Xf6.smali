.class public interface abstract LXf6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/p;


# static fields
.field public static final e:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "Landroidx/camera/core/p$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "camerax.core.useCaseEventCallback"

    const-class v1, Landroidx/camera/core/p$b;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v0

    sput-object v0, LXf6;->e:Landroidx/camera/core/impl/f$a;

    return-void
.end method


# virtual methods
.method public O(Landroidx/camera/core/p$b;)Landroidx/camera/core/p$b;
    .locals 1

    sget-object v0, LXf6;->e:Landroidx/camera/core/impl/f$a;

    invoke-interface {p0, v0, p1}, Landroidx/camera/core/impl/p;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/p$b;

    return-object p1
.end method
