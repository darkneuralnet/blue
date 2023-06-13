.class public final LoB6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LnB6;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LoB6$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0011R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0005R$\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000bR3\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u000c8W@VX\u0096\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0012\u0012\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u0004\u0010\u000f\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u0014"
    }
    d2 = {
        "LoB6;",
        "LnB6;",
        "LEX2;",
        "",
        "a",
        "LEX2;",
        "_isWindowFocused",
        "value",
        "isWindowFocused",
        "()Z",
        "b",
        "(Z)V",
        "LxX3;",
        "getKeyboardModifiers-k7X9c1A",
        "()I",
        "(I)V",
        "getKeyboardModifiers-k7X9c1A$annotations",
        "()V",
        "keyboardModifiers",
        "<init>",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final b:LoB6$a;

.field public static final c:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "LxX3;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LoB6$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LoB6$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LoB6;->b:LoB6$a;

    invoke-static {}, LcX3;->a()I

    move-result v0

    invoke-static {v0}, LxX3;->a(I)LxX3;

    move-result-object v0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v0

    sput-object v0, LoB6;->c:LEX2;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v0

    iput-object v0, p0, LoB6;->a:LEX2;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    sget-object v0, LoB6;->c:LEX2;

    invoke-static {p1}, LxX3;->a(I)LxX3;

    move-result-object p1

    invoke-interface {v0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public b(Z)V
    .locals 1

    iget-object v0, p0, LoB6;->a:LEX2;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method
