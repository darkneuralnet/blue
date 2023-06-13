.class public final LnJ4$b;
.super LnJ4;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LnJ4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\n"
    }
    d2 = {
        "LnJ4$b;",
        "LnJ4;",
        "LMp$a;",
        "b",
        "LMp$a;",
        "a",
        "()LMp$a;",
        "authError",
        "<init>",
        "()V",
        "auth_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:LnJ4$b;

.field public static final b:LMp$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LnJ4$b;

    invoke-direct {v0}, LnJ4$b;-><init>()V

    sput-object v0, LnJ4$b;->a:LnJ4$b;

    sget-object v0, LMp$a;->a:LMp$a;

    sput-object v0, LnJ4$b;->b:LMp$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LnJ4;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public a()LMp$a;
    .locals 1

    sget-object v0, LnJ4$b;->b:LMp$a;

    return-object v0
.end method

.method public bridge synthetic getAuthError()LMp;
    .locals 1

    invoke-virtual {p0}, LnJ4$b;->a()LMp$a;

    move-result-object v0

    return-object v0
.end method
