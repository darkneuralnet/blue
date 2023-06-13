.class public final synthetic LVG2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LLG2;

.field public final synthetic c:Ljava/lang/Throwable;


# direct methods
.method public synthetic constructor <init>(LLG2;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVG2;->b:LLG2;

    iput-object p2, p0, LVG2;->c:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LVG2;->b:LLG2;

    iget-object v1, p0, LVG2;->c:Ljava/lang/Throwable;

    invoke-static {v0, v1}, LLG2$p;->a(LLG2;Ljava/lang/Throwable;)V

    return-void
.end method
