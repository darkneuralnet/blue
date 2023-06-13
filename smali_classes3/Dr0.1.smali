.class public final synthetic LDr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Lzr0;

.field public final synthetic c:Lco/bird/android/model/constant/ComplaintResolutionField;


# direct methods
.method public synthetic constructor <init>(Lzr0;Lco/bird/android/model/constant/ComplaintResolutionField;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDr0;->b:Lzr0;

    iput-object p2, p0, LDr0;->c:Lco/bird/android/model/constant/ComplaintResolutionField;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LDr0;->b:Lzr0;

    iget-object v1, p0, LDr0;->c:Lco/bird/android/model/constant/ComplaintResolutionField;

    invoke-static {v0, v1}, Lzr0$e;->b(Lzr0;Lco/bird/android/model/constant/ComplaintResolutionField;)V

    return-void
.end method
