.class public final Lcom/stripe/android/uicore/image/EmptyPainter;
.super LnE3;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000c\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0014R\u001d\u0010\u0008\u001a\u00020\u00058VX\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/uicore/image/EmptyPainter;",
        "LnE3;",
        "LI61;",
        "",
        "onDraw",
        "LxB5;",
        "getIntrinsicSize-NH-jbRc",
        "()J",
        "intrinsicSize",
        "<init>",
        "()V",
        "stripe-ui-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/uicore/image/EmptyPainter;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/uicore/image/EmptyPainter;

    invoke-direct {v0}, Lcom/stripe/android/uicore/image/EmptyPainter;-><init>()V

    sput-object v0, Lcom/stripe/android/uicore/image/EmptyPainter;->INSTANCE:Lcom/stripe/android/uicore/image/EmptyPainter;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LnE3;-><init>()V

    return-void
.end method


# virtual methods
.method public getIntrinsicSize-NH-jbRc()J
    .locals 2

    sget-object v0, LxB5;->b:LxB5$a;

    invoke-virtual {v0}, LxB5$a;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public onDraw(LI61;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
