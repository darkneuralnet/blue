.class public final synthetic LBw1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/emoji2/text/e$b;


# direct methods
.method public synthetic constructor <init>(Landroidx/emoji2/text/e$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBw1;->b:Landroidx/emoji2/text/e$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LBw1;->b:Landroidx/emoji2/text/e$b;

    invoke-virtual {v0}, Landroidx/emoji2/text/e$b;->d()V

    return-void
.end method
