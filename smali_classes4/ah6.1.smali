.class public final synthetic Lah6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireUserGuest;

    check-cast p2, Lco/bird/android/model/wire/WireUserGuest;

    invoke-static {p1, p2}, Lbh6;->f(Lco/bird/android/model/wire/WireUserGuest;Lco/bird/android/model/wire/WireUserGuest;)I

    move-result p1

    return p1
.end method
