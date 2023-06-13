.class public final synthetic LJw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LcD1$j;


# instance fields
.field public final synthetic a:LLw;


# direct methods
.method public synthetic constructor <init>(LLw;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJw;->a:LLw;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    iget-object v0, p0, LJw;->a:LLw;

    invoke-static {v0, p1}, LLw;->Ql(LLw;Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method
