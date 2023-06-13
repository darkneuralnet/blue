.class public final synthetic LEt1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/q;


# instance fields
.field public final synthetic b:Lorg/joda/time/DateTime;


# direct methods
.method public synthetic constructor <init>(Lorg/joda/time/DateTime;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LEt1;->b:Lorg/joda/time/DateTime;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LEt1;->b:Lorg/joda/time/DateTime;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, LQt1;->C(Lorg/joda/time/DateTime;Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method
