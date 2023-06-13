.class public LTT;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LtM4;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LtM4<",
        "Landroid/graphics/Bitmap;",
        "Landroid/graphics/drawable/BitmapDrawable;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/res/Resources;

    iput-object p1, p0, LTT;->a:Landroid/content/res/Resources;

    return-void
.end method


# virtual methods
.method public a(LVL4;Lsy3;)LVL4;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVL4<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lsy3;",
            ")",
            "LVL4<",
            "Landroid/graphics/drawable/BitmapDrawable;",
            ">;"
        }
    .end annotation

    iget-object p2, p0, LTT;->a:Landroid/content/res/Resources;

    invoke-static {p2, p1}, Ldn2;->f(Landroid/content/res/Resources;LVL4;)LVL4;

    move-result-object p1

    return-object p1
.end method
