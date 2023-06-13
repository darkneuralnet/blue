.class public final synthetic LLI;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LOI;


# direct methods
.method public synthetic constructor <init>(LOI;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLI;->b:LOI;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LLI;->b:LOI;

    invoke-static {v0}, LOI;->A(LOI;)V

    return-void
.end method
