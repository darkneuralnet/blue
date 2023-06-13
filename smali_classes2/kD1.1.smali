.class public final synthetic LkD1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LrD1;

.field public final synthetic c:Lco/bird/android/model/PaymentAddSource;


# direct methods
.method public synthetic constructor <init>(LrD1;Lco/bird/android/model/PaymentAddSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LkD1;->b:LrD1;

    iput-object p2, p0, LkD1;->c:Lco/bird/android/model/PaymentAddSource;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LkD1;->b:LrD1;

    iget-object v1, p0, LkD1;->c:Lco/bird/android/model/PaymentAddSource;

    invoke-static {v0, v1}, LrD1;->y(LrD1;Lco/bird/android/model/PaymentAddSource;)V

    return-void
.end method
