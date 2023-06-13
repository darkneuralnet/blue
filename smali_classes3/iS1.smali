.class public final synthetic LiS1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LfS1;


# direct methods
.method public synthetic constructor <init>(LfS1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LiS1;->b:LfS1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LiS1;->b:LfS1;

    invoke-static {v0}, LfS1$l;->b(LfS1;)V

    return-void
.end method
