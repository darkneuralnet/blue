.class public interface abstract LRY5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/p;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Landroidx/camera/core/impl/p;"
    }
.end annotation


# static fields
.field public static final b:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "camerax.core.target.name"

    const-class v1, Ljava/lang/String;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v0

    sput-object v0, LRY5;->b:Landroidx/camera/core/impl/f$a;

    const-string v0, "camerax.core.target.class"

    const-class v1, Ljava/lang/Class;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v0

    sput-object v0, LRY5;->c:Landroidx/camera/core/impl/f$a;

    return-void
.end method


# virtual methods
.method public q(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    sget-object v0, LRY5;->b:Landroidx/camera/core/impl/f$a;

    invoke-interface {p0, v0, p1}, Landroidx/camera/core/impl/p;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method
