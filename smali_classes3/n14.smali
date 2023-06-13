.class public final synthetic Ln14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Lm14;


# direct methods
.method public synthetic constructor <init>(Lm14;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln14;->b:Lm14;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ln14;->b:Lm14;

    invoke-static {v0}, Lm14$c;->a(Lm14;)V

    return-void
.end method
