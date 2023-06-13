.class public final synthetic LjA2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LlA2;


# direct methods
.method public synthetic constructor <init>(LlA2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LjA2;->b:LlA2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LjA2;->b:LlA2;

    invoke-static {v0}, LlA2;->a(LlA2;)V

    return-void
.end method
