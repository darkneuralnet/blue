.class public LP80$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP80;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:LLw1$c;

.field public final synthetic c:I

.field public final synthetic d:LP80;


# direct methods
.method public constructor <init>(LP80;LLw1$c;I)V
    .locals 0

    iput-object p1, p0, LP80$b;->d:LP80;

    iput-object p2, p0, LP80$b;->b:LLw1$c;

    iput p3, p0, LP80$b;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, LP80$b;->b:LLw1$c;

    iget v1, p0, LP80$b;->c:I

    invoke-virtual {v0, v1}, LLw1$c;->a(I)V

    return-void
.end method
