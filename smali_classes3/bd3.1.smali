.class public final Lbd3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Module;
    subcomponents = {
        Lza3;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbd3$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u0003B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000e"
    }
    d2 = {
        "Lbd3;",
        "",
        "LAa3;",
        "a",
        "Landroidx/fragment/app/FragmentManager;",
        "Landroidx/fragment/app/FragmentManager;",
        "fragmentManager",
        "",
        "b",
        "I",
        "containerId",
        "<init>",
        "(Landroidx/fragment/app/FragmentManager;I)V",
        "c",
        "notification-center_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final c:Lbd3$a;


# instance fields
.field public final a:Landroidx/fragment/app/FragmentManager;

.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbd3$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbd3$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lbd3;->c:Lbd3$a;

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/FragmentManager;I)V
    .locals 1

    const-string v0, "fragmentManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbd3;->a:Landroidx/fragment/app/FragmentManager;

    iput p2, p0, Lbd3;->b:I

    return-void
.end method


# virtual methods
.method public final a()LAa3;
    .locals 3
    .annotation runtime Ldagger/Provides;
    .end annotation

    new-instance v0, LAa3;

    iget-object v1, p0, Lbd3;->a:Landroidx/fragment/app/FragmentManager;

    iget v2, p0, Lbd3;->b:I

    invoke-direct {v0, v1, v2}, LAa3;-><init>(Landroidx/fragment/app/FragmentManager;I)V

    return-object v0
.end method
