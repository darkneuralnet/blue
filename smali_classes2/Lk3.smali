.class public final synthetic LLk3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LEk3;


# direct methods
.method public synthetic constructor <init>(LEk3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLk3;->b:LEk3;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LLk3;->b:LEk3;

    invoke-static {v0}, LEk3$B;->a(LEk3;)V

    return-void
.end method