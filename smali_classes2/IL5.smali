.class public final synthetic LIL5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LGL5;


# direct methods
.method public synthetic constructor <init>(LGL5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIL5;->b:LGL5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LIL5;->b:LGL5;

    invoke-static {v0}, LGL5$c;->a(LGL5;)V

    return-void
.end method
