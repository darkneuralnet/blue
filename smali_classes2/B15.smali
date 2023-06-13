.class public final synthetic LB15;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/q;


# instance fields
.field public final synthetic b:Li25;


# direct methods
.method public synthetic constructor <init>(Li25;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB15;->b:Li25;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LB15;->b:Li25;

    invoke-static {v0, p1}, Li25;->X2(Li25;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
