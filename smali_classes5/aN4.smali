.class public abstract LaN4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LaN4$c;,
        LaN4$b;,
        LaN4$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        "E:",
        "Ljava/lang/Exception;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u0000 \u0006*\u0006\u0008\u0000\u0010\u0001 \u0001*\u000e\u0008\u0001\u0010\u0004 \u0001*\u00060\u0002j\u0002`\u00032\u00020\u0005:\u0003\u0006\n\u000bB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u0006\u001a\u00028\u0000H&\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u0082\u0001\u0002\u000c\r\u00a8\u0006\u000e"
    }
    d2 = {
        "LaN4;",
        "V",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "E",
        "",
        "a",
        "()Ljava/lang/Object;",
        "<init>",
        "()V",
        "b",
        "c",
        "LaN4$c;",
        "LaN4$b;",
        "result"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final a:LaN4$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LaN4$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LaN4$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LaN4;->a:LaN4$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, LaN4;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation
.end method
