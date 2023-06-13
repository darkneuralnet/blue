.class public final synthetic LIR2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LTR2;


# direct methods
.method public synthetic constructor <init>(LTR2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIR2;->b:LTR2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LIR2;->b:LTR2;

    invoke-static {v0}, LTR2;->s(LTR2;)V

    return-void
.end method
