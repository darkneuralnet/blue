.class public LP80$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP80;->c(Landroid/graphics/Typeface;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:LLw1$c;

.field public final synthetic c:Landroid/graphics/Typeface;

.field public final synthetic d:LP80;


# direct methods
.method public constructor <init>(LP80;LLw1$c;Landroid/graphics/Typeface;)V
    .locals 0

    iput-object p1, p0, LP80$a;->d:LP80;

    iput-object p2, p0, LP80$a;->b:LLw1$c;

    iput-object p3, p0, LP80$a;->c:Landroid/graphics/Typeface;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, LP80$a;->b:LLw1$c;

    iget-object v1, p0, LP80$a;->c:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, LLw1$c;->b(Landroid/graphics/Typeface;)V

    return-void
.end method
