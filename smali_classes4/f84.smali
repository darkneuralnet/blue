.class public final synthetic Lf84;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/J;


# instance fields
.field public final synthetic a:Ll84;

.field public final synthetic b:Lco/bird/android/model/Link;


# direct methods
.method public synthetic constructor <init>(Ll84;Lco/bird/android/model/Link;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf84;->a:Ll84;

    iput-object p2, p0, Lf84;->b:Lco/bird/android/model/Link;

    return-void
.end method


# virtual methods
.method public final subscribe(Lio/reactivex/H;)V
    .locals 2

    iget-object v0, p0, Lf84;->a:Ll84;

    iget-object v1, p0, Lf84;->b:Lco/bird/android/model/Link;

    invoke-static {v0, v1, p1}, Ll84;->Q(Ll84;Lco/bird/android/model/Link;Lio/reactivex/H;)V

    return-void
.end method
