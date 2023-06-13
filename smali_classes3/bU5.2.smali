.class public final synthetic LbU5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lco/bird/android/feature/suggestanest/SuggestNestActivity;

.field public final synthetic c:LOU5;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/feature/suggestanest/SuggestNestActivity;LOU5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LbU5;->b:Lco/bird/android/feature/suggestanest/SuggestNestActivity;

    iput-object p2, p0, LbU5;->c:LOU5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LbU5;->b:Lco/bird/android/feature/suggestanest/SuggestNestActivity;

    iget-object v1, p0, LbU5;->c:LOU5;

    invoke-static {v0, v1}, Lco/bird/android/feature/suggestanest/SuggestNestActivity;->h0(Lco/bird/android/feature/suggestanest/SuggestNestActivity;LOU5;)V

    return-void
.end method
