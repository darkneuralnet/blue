.class public final LvY2$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LvY2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LvY2$f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0008\u0018\u0000 \u00062\u00020\u0001:\u0001\u0004B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R(\u0010\u0008\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007R$\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0011"
    }
    d2 = {
        "LvY2$f;",
        "",
        "LvY2$e;",
        "<set-?>",
        "a",
        "LvY2$e;",
        "c",
        "()LvY2$e;",
        "appInfo",
        "",
        "b",
        "I",
        "d",
        "()I",
        "protocolVersion",
        "<init>",
        "()V",
        "facebook-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final c:LvY2$f$a;


# instance fields
.field public a:LvY2$e;

.field public b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LvY2$f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LvY2$f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LvY2$f;->c:LvY2$f$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, LvY2$f;-><init>()V

    return-void
.end method

.method public static final synthetic a(LvY2$f;LvY2$e;)V
    .locals 0

    iput-object p1, p0, LvY2$f;->a:LvY2$e;

    return-void
.end method

.method public static final synthetic b(LvY2$f;I)V
    .locals 0

    iput p1, p0, LvY2$f;->b:I

    return-void
.end method


# virtual methods
.method public final c()LvY2$e;
    .locals 1

    iget-object v0, p0, LvY2$f;->a:LvY2$e;

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, LvY2$f;->b:I

    return v0
.end method
