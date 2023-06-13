.class public final synthetic LFv3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LCv3;


# direct methods
.method public synthetic constructor <init>(LCv3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFv3;->b:LCv3;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LFv3;->b:LCv3;

    invoke-static {v0}, LCv3$l;->a(LCv3;)V

    return-void
.end method
