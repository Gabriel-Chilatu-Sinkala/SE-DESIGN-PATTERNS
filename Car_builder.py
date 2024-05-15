# Product class
class Computer:
    def __init__(self, case, motherboard, cpu, memory, storage, gpu=None):
        self.case = case
        self.motherboard = motherboard
        self.cpu = cpu
        self.memory = memory
        self.storage = storage
        self.gpu = gpu

    def __str__(self):
        gpu_str = f", GPU: {self.gpu}" if self.gpu else ""
        return f"Computer: {self.case}, {self.motherboard}, {self.cpu}, {self.memory}, {self.storage}{gpu_str}"


# Create the Builder interface
class ComputerBuilder:
    def __init__(self):
        self.computer = Computer(None, None, None, None, None)

# This sets the methods to attributes of the computer object
    def set_case(self, case):
        self.computer.case = case
        return self

    def set_motherboard(self, motherboard):
        self.computer.motherboard = motherboard
        return self

    def set_cpu(self, cpu):
        self.computer.cpu = cpu
        return self

    def set_memory(self, memory):
        self.computer.memory = memory
        return self

    def set_storage(self, storage):
        self.computer.storage = storage
        return self

    def set_gpu(self, gpu):
        self.computer.gpu = gpu
        return self

    def build(self):
        return self.computer

# Director class, the director guides the constructor method
class Director:
    def __init__(self, builder):
        self.builder = builder

    def construct_gaming_computer(self):
        return self.builder \
            .set_case("ATX Mid Tower") \
            .set_motherboard("MSI Z490-A PRO ATX LGA1200 Motherboard") \
            .set_cpu("Intel Core i9-10900K 3.7 GHz 10-Core Processor") \
            .set_memory("Corsair Vengeance LPX 16GB (2 x 8GB) DDR4-3200 CL16 Memory") \
            .set_storage("Samsung 970 Evo 1TB M.2-2280 NVME Solid State Drive") \
            .set_gpu("Nvidia GeForce RTX 3080 10GB Founders Edition") \
            .build()

    def construct_office_computer(self):
        return self.builder \
            .set_case("MicroATX Mini Tower") \
            .set_motherboard("ASRock B450M PRO4 Micro ATX AM4 Motherboard") \
            .set_cpu("AMD Ryzen 5 3600 3.6 GHz 6-Core Processor") \
            .set_memory("G.Skill Ripjaws V Series 16GB (2 x 8GB) DDR4-3200 CL16 Memory") \
            .set_storage("Crucial MX500 1TB 2.5 Inch SATA III Internal SSD") \
            .build()

# Client code
builder = ComputerBuilder()
director = Director(builder)

gaming_computer = director.construct_gaming_computer()
print("Gaming Computer:")
print(gaming_computer)

office_computer = director.construct_office_computer()
print("\nOffice Computer:")
print(office_computer)
