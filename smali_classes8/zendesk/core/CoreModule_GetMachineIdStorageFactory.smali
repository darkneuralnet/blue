.class public final Lzendesk/core/CoreModule_GetMachineIdStorageFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/core/MachineIdStorage;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lzendesk/core/CoreModule;


# direct methods
.method public constructor <init>(Lzendesk/core/CoreModule;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/core/CoreModule_GetMachineIdStorageFactory;->module:Lzendesk/core/CoreModule;

    return-void
.end method

.method public static create(Lzendesk/core/CoreModule;)Lzendesk/core/CoreModule_GetMachineIdStorageFactory;
    .locals 1

    new-instance v0, Lzendesk/core/CoreModule_GetMachineIdStorageFactory;

    invoke-direct {v0, p0}, Lzendesk/core/CoreModule_GetMachineIdStorageFactory;-><init>(Lzendesk/core/CoreModule;)V

    return-object v0
.end method

.method public static getMachineIdStorage(Lzendesk/core/CoreModule;)Lzendesk/core/MachineIdStorage;
    .locals 0

    invoke-virtual {p0}, Lzendesk/core/CoreModule;->getMachineIdStorage()Lzendesk/core/MachineIdStorage;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzendesk/core/MachineIdStorage;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/core/CoreModule_GetMachineIdStorageFactory;->get()Lzendesk/core/MachineIdStorage;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/core/MachineIdStorage;
    .locals 1

    iget-object v0, p0, Lzendesk/core/CoreModule_GetMachineIdStorageFactory;->module:Lzendesk/core/CoreModule;

    invoke-static {v0}, Lzendesk/core/CoreModule_GetMachineIdStorageFactory;->getMachineIdStorage(Lzendesk/core/CoreModule;)Lzendesk/core/MachineIdStorage;

    move-result-object v0

    return-object v0
.end method
