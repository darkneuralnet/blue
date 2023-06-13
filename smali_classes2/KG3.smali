.class public final synthetic LKG3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# instance fields
.field public final synthetic b:LgH3;


# direct methods
.method public synthetic constructor <init>(LgH3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKG3;->b:LgH3;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LKG3;->b:LgH3;

    invoke-static {v0, p1}, LgH3;->h(LgH3;Ljava/lang/Object;)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method
