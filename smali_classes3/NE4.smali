.class public final synthetic LNE4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LIE4;

.field public final synthetic c:Lco/bird/android/model/Repair;


# direct methods
.method public synthetic constructor <init>(LIE4;Lco/bird/android/model/Repair;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNE4;->b:LIE4;

    iput-object p2, p0, LNE4;->c:Lco/bird/android/model/Repair;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LNE4;->b:LIE4;

    iget-object v1, p0, LNE4;->c:Lco/bird/android/model/Repair;

    invoke-static {v0, v1}, LIE4$s;->c(LIE4;Lco/bird/android/model/Repair;)V

    return-void
.end method
