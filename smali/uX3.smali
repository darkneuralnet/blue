.class public final LuX3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LqX3;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LuX3$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007\u00a2\u0006\u0004\u0008!\u0010\"R.\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0005\u0010\u0007\"\u0004\u0008\u0008\u0010\tR.\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R\u001a\u0010 \u001a\u00020\u001b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006#"
    }
    d2 = {
        "LuX3;",
        "LqX3;",
        "Lkotlin/Function1;",
        "Landroid/view/MotionEvent;",
        "",
        "b",
        "Lkotlin/jvm/functions/Function1;",
        "()Lkotlin/jvm/functions/Function1;",
        "h",
        "(Lkotlin/jvm/functions/Function1;)V",
        "onTouchEvent",
        "LHI4;",
        "value",
        "c",
        "LHI4;",
        "getRequestDisallowInterceptTouchEvent",
        "()LHI4;",
        "j",
        "(LHI4;)V",
        "requestDisallowInterceptTouchEvent",
        "d",
        "Z",
        "a",
        "()Z",
        "g",
        "(Z)V",
        "disallowIntercept",
        "LpX3;",
        "e",
        "LpX3;",
        "P0",
        "()LpX3;",
        "pointerInputFilter",
        "<init>",
        "()V",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public b:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/view/MotionEvent;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public c:LHI4;

.field public d:Z

.field public final e:LpX3;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LuX3$b;

    invoke-direct {v0, p0}, LuX3$b;-><init>(LuX3;)V

    iput-object v0, p0, LuX3;->e:LpX3;

    return-void
.end method


# virtual methods
.method public P0()LpX3;
    .locals 1

    iget-object v0, p0, LuX3;->e:LpX3;

    return-object v0
.end method

.method public final a()Z
    .locals 1

    iget-boolean v0, p0, LuX3;->d:Z

    return v0
.end method

.method public final b()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Landroid/view/MotionEvent;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LuX3;->b:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "onTouchEvent"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final g(Z)V
    .locals 0

    iput-boolean p1, p0, LuX3;->d:Z

    return-void
.end method

.method public final h(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/view/MotionEvent;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LuX3;->b:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final j(LHI4;)V
    .locals 2

    iget-object v0, p0, LuX3;->c:LHI4;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LHI4;->b(LuX3;)V

    :goto_0
    iput-object p1, p0, LuX3;->c:LHI4;

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1, p0}, LHI4;->b(LuX3;)V

    :goto_1
    return-void
.end method
